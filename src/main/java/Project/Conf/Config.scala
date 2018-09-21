package Project.Conf

import org.apache.spark.sql.SparkSession

object Config {

    val sparkSession = SparkSession.builder().
      appName("dataframework").
      master("local").getOrCreate()

    var sc = sparkSession.sparkContext


}
