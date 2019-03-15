package com.hziee.heavneye;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回信息
 *
 * @author MessiahJK
 * @date 2018/9/18
 * @time 16:28
 */
public class Msg {
    /**
     * 权限信息/状态码
     * 200 成功
     * 400 参数有误
     * 401 权限不足
     * 403 失败！拒绝访问
     * 404 无法找到
     * 500 服务器出错
     */
    private int code;
    /**
     * 提示信息
     */
    private String msg;

    private Map<String, Object> data = new HashMap<String, Object>();

    public static Msg statu200() {
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg("成功");
        return result;
    }

    public static Msg statu400() {
        Msg result = new Msg();
        result.setCode(400);
        result.setMsg("参数缺失或有误");
        return result;
    }

    public static Msg statu401() {
        Msg result = new Msg();
        result.setCode(401);
        result.setMsg("权限不足");
        return result;
    }

    public static Msg statu403() {
        Msg result = new Msg();
        result.setCode(403);
        result.setMsg("错误！拒绝访问");
        return result;
    }

    public static Msg statu404() {
        Msg result = new Msg();
        result.setCode(404);
        result.setMsg("无法找到资源");
        return result;
    }

    public static Msg statu500() {
        Msg result = new Msg();
        result.setCode(500);
        result.setMsg("服务器出错");
        return result;
    }

    public Msg add(String key, Object value) {
        this.getData().put(key, value);
        return this;
    }

    public Msg addrole(String key, int value) {
        String[] role = {"管理员", "用户", "记录员", "活动创办者"};
        this.getData().put(key, role[value]);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }


}
