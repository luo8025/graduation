package taru.luo.graduation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.biz.RemindBiz;
import taru.luo.graduation.entity.Remind;
import taru.luo.graduation.service.RemindService;

import java.util.List;

@Service
public class RemindServiceImpl implements RemindService {
    @Autowired
    RemindBiz remindBiz;

    @Override
    public List<Remind> remindList(String id) {
        return remindBiz.remindList(id);
    }

    @Override
    public void updateStatus(String id) {
        remindBiz.updateStatus(id);
    }
}
