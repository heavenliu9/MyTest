package test.wn.modules;

import com.weinong.base.*;
import test.wn.bean.Liuqian;
import test.wn.requestbean.UpdateLiuqianForm;
import test.wn.service.LiuqianService;
import yao.util.string.StringUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/3.
 */
@ApiDefined(label = "updatelqAction",description = "updatelq信息")
public class UpdateLiuqianAction extends BaseApiAction {

    @ParamDefined(label = "请求参数", checkType = CheckType.empty)
    private UpdateLiuqianForm param;

    // >0 成功 0 系统异常 <0 失败
    @Override
    protected void registResult(Map<Integer, String> map) {
        map.put(1, "修改成功");
        map.put(-1, "修改失败");
        map.put(-2, "Id不能为空");
    }

    @Override
    public ApiResult doApi() throws Exception {
        if (StringUtil.isEmpty(String.valueOf(param.getId())))
            return result_fail(-2);
        try {
            int num = LiuqianService.update(this.buildLiuqian(param));
            if (num > 0)
                return result_success(1, true);
            else
                return result_success(-1, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result_fail(-1);
    }

    private Liuqian buildLiuqian(UpdateLiuqianForm param) {
        Liuqian lq = new Liuqian();
        lq.setId(param.getId());
        lq.setAge(param.getAge());
        lq.setName(param.getName());
        return lq;
    }

    public UpdateLiuqianForm getParam() {
        return param;
    }

    public void setParam(UpdateLiuqianForm param) {
        this.param = param;
    }
}
