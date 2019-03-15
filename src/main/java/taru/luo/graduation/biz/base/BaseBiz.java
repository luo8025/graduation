package taru.luo.graduation.biz.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import taru.luo.graduation.mapper.base.BizMapper;

import java.util.List;

/**
 * 基础Biz
 */
@Slf4j
public abstract class BaseBiz<M extends BizMapper<T>,T> {

    @Autowired
    protected M mapper;

    public T selectById(Object id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<T> selectListAll() {
        return mapper.selectAll();
    }

    public void delete(T entity) {
        mapper.delete(entity);
    }

    public void deleteById(T entity) {
        mapper.deleteByPrimaryKey(entity);
    }

    public void updateByPrimaryKey(T entity) {
        mapper.updateByPrimaryKey(entity);
    }

    public void insert(T entity) {
        mapper.insert(entity);
    }

    public void insertList(List<T> list) {
        mapper.insertList(list);
    }
}
