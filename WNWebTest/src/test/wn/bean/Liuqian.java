package test.wn.bean;

import yao.util.db.bean.TableDefined;

/**
 * Created by liuqian on 2016/3/2.
 */
@TableDefined(table = "liuqian", primaryKey = "id")
public class Liuqian {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
