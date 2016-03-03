package test.wn.modules;

import com.weinong.base.*;
import test.wn.bean.Liuqian;
import test.wn.requestbean.AddLiuqianForm;
import test.wn.service.LiuqianService;
import yao.util.string.StringUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/3.
 */
@ApiDefined(label = "addlqAction",description = "addlq信息")
public class AddLiuqianAction  extends BaseApiAction {

    @ParamDefined(label = "请求参数",checkType = CheckType.empty)
    private AddLiuqianForm param;

    // >0 成功 0 系统异常 <0 失败
    @Override
    protected void registResult(Map<Integer, String> map) {
        map.put(1,"添加成功");
        map.put(-1,"添加失败");
    }

    @Override
    public ApiResult doApi() throws Exception {

        Liuqian lq = new Liuqian();
        try {
            lq = LiuqianService.save(this.buildLiuqian(param));
            Map<String, Object> rs = new HashMap<>();
            rs.put("lq", lq);
            return result_success(1, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result_fail(-1);
    }

    private Liuqian buildLiuqian(AddLiuqianForm param) {
        Liuqian lq = new Liuqian();
        lq.setAge(param.getAge());
        lq.setName(param.getName());
        return lq;
    }

    public AddLiuqianForm getParam() {
        return param;
    }

    public void setParam(AddLiuqianForm param) {
        this.param = param;
    }
}
