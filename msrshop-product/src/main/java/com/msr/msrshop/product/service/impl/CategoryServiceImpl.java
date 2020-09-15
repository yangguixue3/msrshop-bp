package com.msr.msrshop.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.msr.common.utils.PageUtils;
import com.msr.common.utils.Query;
import java.util.List;
import com.msr.msrshop.product.dao.CategoryDao;
import com.msr.msrshop.product.entity.CategoryEntity;
import com.msr.msrshop.product.service.CategoryService;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        List<CategoryEntity> level1Menus = entities.stream().filter(
                //删选一级菜单
                categoryEntity -> categoryEntity.getParentCid() == 0
        ).map( menu1 -> {
            menu1.setChildren(getChildren(menu1,entities));
            return menu1;
        }).sorted((x,y)->{
            return (x.getSort() == null ? 0 : x.getSort()) - (y.getSort() == null ? 0 : y.getSort());
        }).collect(Collectors.toList());
        return level1Menus;
    }

    private List<CategoryEntity> getChildren(CategoryEntity menu1, List<CategoryEntity> entities) {
        List<CategoryEntity> children = entities.stream().filter(
                categoryEntity -> {
                    return categoryEntity.getParentCid() == menu1.getCatId();
                }).map(menu2 -> {
                    // 递归调用
                    menu2.setChildren(getChildren(menu2,entities));
                    return menu2;
                }
        ).sorted((x,y)->{
            return (x.getSort() == null ? 0 : x.getSort()) - (y.getSort() == null ? 0 : y.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}