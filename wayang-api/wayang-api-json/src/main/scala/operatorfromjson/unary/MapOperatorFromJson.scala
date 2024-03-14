package org.apache.wayang.api.json.operatorfromjson.unary

import com.fasterxml.jackson.annotation.JsonTypeName
import org.apache.wayang.api.json.operatorfromjson.OperatorFromJson

@JsonTypeName(OperatorFromJson.OperatorNames.Map)
case class MapOperatorFromJson(override val id: Long,
                               override val input: Array[Long],
                               override val output: Array[Long],
                               override val cat: String,
                               override val operatorName: String,
                               val data: MapOperatorFromJson.Data,
                               override val executionPlatform: String = null)
  extends OperatorFromJson(id, input, output, cat, operatorName, executionPlatform) {
}

object MapOperatorFromJson {
  case class Data(udf: String)
}

