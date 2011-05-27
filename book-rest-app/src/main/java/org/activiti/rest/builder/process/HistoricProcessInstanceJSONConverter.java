/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.rest.builder.process;

import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.rest.builder.JSONConverter;
import org.activiti.rest.util.JSONUtil;
import org.json.JSONException;
import org.json.JSONObject;



public class HistoricProcessInstanceJSONConverter implements JSONConverter<HistoricProcessInstance> {

  public JSONObject getJSONObject(HistoricProcessInstance processInstance) throws JSONException {
    JSONObject json = new JSONObject();

    JSONUtil.putRetainNull(json, "id", processInstance.getId());
    JSONUtil.putRetainNull(json, "processDefinitionId", processInstance.getProcessDefinitionId());
    JSONUtil.putRetainNull(json, "businessKey", processInstance.getBusinessKey());
    JSONUtil.putRetainNull(json, "startTime", processInstance.getStartTime());
    JSONUtil.putRetainNull(json, "startUserId", processInstance.getStartUserId());

    return json;
  }




  public HistoricProcessInstance getObject(JSONObject jsonObject) throws JSONException {
    throw new UnsupportedOperationException();
  }

}
