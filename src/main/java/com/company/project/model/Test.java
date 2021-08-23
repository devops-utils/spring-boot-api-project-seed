package com.company.project.model;

import javax.persistence.*;

public class Test {
    /**
     * id
     */
    @Id
    @Column(name = "test_id")
    private Long testId;

    /**
     * name
     */
    @Column(name = "test_name")
    private String testName;

    /**
     * 状态 -1-删除 1-正常
     */
    private Byte status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Integer createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Integer updateTime;

    /**
     * 获取id
     *
     * @return test_id - id
     */
    public Long getTestId() {
        return testId;
    }

    /**
     * 设置id
     *
     * @param testId id
     */
    public void setTestId(Long testId) {
        this.testId = testId;
    }

    /**
     * 获取name
     *
     * @return test_name - name
     */
    public String getTestName() {
        return testName;
    }

    /**
     * 设置name
     *
     * @param testName name
     */
    public void setTestName(String testName) {
        this.testName = testName;
    }

    /**
     * 获取状态 -1-删除 1-正常
     *
     * @return status - 状态 -1-删除 1-正常
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态 -1-删除 1-正常
     *
     * @param status 状态 -1-删除 1-正常
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}