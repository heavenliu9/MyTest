package test.wn.requestbean;

import com.weinong.base.CheckType;
import com.weinong.base.JsonParam;
import com.weinong.base.ParamDefined;

/**
 * Created by Administrator on 2016/3/3.
 */
public class DeleteLiuqianForm implements JsonParam {
    @ParamDefined(label = "lqId", checkType = CheckType.empty)
    private Integer id;
//    private String name;
//    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
}
