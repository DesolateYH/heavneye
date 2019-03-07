package com.hziee.heavneye.dao;

import com.hziee.heavneye.model.po.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author MessiahJK
 * @date 2018/9/21
 * @time 15:42
 */

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
    /**
     * 通过id查询活动
     *
     * @param id
     * @return
     */
    Activity findById(int id);

}
