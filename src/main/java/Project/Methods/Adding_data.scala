package Project.Methods

import org.apache.spark.sql.{SQLContext, SparkSession}

object Adding_data {
  val sparkSession = SparkSession.builder().appName("").master("local").getOrCreate()
  var sc = sparkSession.sparkContext
  var rdd = sc.textFile("C:\\Users\\Thipu\\Downloads\\New folder\\Telco.csv")


}
