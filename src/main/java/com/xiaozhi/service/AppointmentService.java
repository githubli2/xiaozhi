package com.xiaozhi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhi.entity.Appointment;

public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}
