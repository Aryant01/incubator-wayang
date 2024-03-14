package org.apache.wayang.api.json.operatorfromjson.input

import com.fasterxml.jackson.annotation.JsonTypeName
import org.apache.wayang.api.json.operatorfromjson.OperatorFromJson


@JsonTypeName(OperatorFromJson.OperatorNames.JDBCRemoteInput)
case class JDBCRemoteInputFromJson(override val id: Long,
                                   override val input: Array[Long],
                                   override val output: Array[Long],
                                   override val cat: String,
                                   override val operatorName: String,
                                   val data: JDBCRemoteInputFromJson.Data,
                                   override val executionPlatform: String = null)
  extends OperatorFromJson(id, input, output, cat, operatorName, executionPlatform) {
}

object JDBCRemoteInputFromJson {
  case class Data(uri: String, username: String, password: String, table: String, columnNames: List[String])
}

