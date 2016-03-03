package test.wn.requestbean;

import com.weinong.base.CheckType;
import com.weinong.base.JsonParam;
import com.weinong.base.ParamDefined;

/**
 * Created by Administrator on 2016/3/3.
 */
public class AddLiuqianForm implements JsonParam {

    @ParamDefined(label = "name", checkType = CheckType.empty)
    private String name;
    @ParamDefined(label = "age", checkType = CheckType.empty)
    private Integer age;


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
