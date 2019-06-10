package taru.luo.graduation.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.entity.Remind;
import taru.luo.graduation.entity.User;
import taru.luo.graduation.mapper.RemindMapper;
import taru.luo.graduation.mapper.UserMapper;

import java.util.List;

@Service
public class RemindBiz {
    @Autowired
    RemindMapper remindMapper;

    public void addRemind(Remind remind){
        remindMapper.addRemind(remind);
    }

    public List<Remind> remindList(String id){
         return remindMapper.remindList(id);
    }

    public void updateStatus(String id) {
        remindMapper.updateStatus(id);
    }
}
