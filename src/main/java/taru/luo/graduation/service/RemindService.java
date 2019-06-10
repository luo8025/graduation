package taru.luo.graduation.service;

import taru.luo.graduation.entity.Remind;

import java.util.List;

public interface RemindService {
    List<Remind> remindList(String id);

    void updateStatus(String id);
}
