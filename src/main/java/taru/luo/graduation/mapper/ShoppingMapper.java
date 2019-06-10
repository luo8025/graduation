package taru.luo.graduation.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import taru.luo.graduation.entity.Shopping;
import taru.luo.graduation.vo.ShoppingVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface ShoppingMapper extends Mapper<Shopping> {

    void addShopping(Shopping shopping);

    List<ShoppingVO> selectShoppingByUserId(@Param("id") String id);

    void deleteShopping(@Param("id")String id);
}
