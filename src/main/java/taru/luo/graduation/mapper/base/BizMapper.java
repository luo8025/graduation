package taru.luo.graduation.mapper.base;

import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * TODO
 *
 * @author liugang
 * @since 2018-06-15
 */
public interface BizMapper<T> extends Mapper<T>,InsertListMapper<T> {

}