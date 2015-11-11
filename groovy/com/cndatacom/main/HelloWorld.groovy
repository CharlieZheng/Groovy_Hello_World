package com.cndatacom.main

class HelloWorld {
	def repeat(val){
		for(i = 0; i < 5; i++){
			println val
		}
	}

	static main(args) {
		/*def str = 'Hello World!'
		 println str.class
		 println str
		 repeat(str)*/
		/*def range = 0..<4
		 println range.class
		 assert range instanceof List*/
		/*def coll = ["Groovy", "Java", "Ruby"]
		 coll.add("Python")
		 coll << "Smalltalk"
		 coll[6] = "Perl"
		 assert  coll instanceof Collection
		 assert coll instanceof ArrayList
		 println coll*/
		/*def numbers = [1, 2, 3, 4]
		 assert numbers + 5 == [1, 2, 3, 4, 5]
		 assert numbers - [2, 3]== [1, 4]
		 println numbers*/
		/*def numbers = [1, 2, 3, 4]
		 assert numbers.join(",") == "1,2,3,4"
		 assert [1, 2, 3, 4, 3].count(3) == 2*/
		// 分布操作符（spread operator）“*”
		/*assert ["JAVA", "GROOVY"]==
		 ["Java", "Groovy"]*.toUpperCase()*/
		/*def hash = [name:"Andy", "VPN-#":45]
		 assert hash.getClass() == java.util.LinkedHashMap
		 hash.put("id", 23)
		 assert hash.get("name") == "Andy"
		 hash.dob = "01/29/76"
		 assert hash.dob == "01/29/76"
		 assert hash["name"] == "Andy"
		 hash["gender"] = "male"
		 assert hash.gender == "male"
		 assert hash["gender"] == "male"*/
		/*def acoll = ["Groovy", "Java", "Ruby"]
		 for(Iterator iter = acoll.iterator(); iter.hasNext();){
		 println iter.next()
		 }
		 acoll.each{ println it }
		 // 闭包中的it变量是一个关键字，指向被调用的外部集合的每个值。它是默认值，可以用传递给闭包的参数覆盖它。下面的代码执行同样的操作，但使用自己的项变量：
		 acoll.each{ value -> println value }*/
		/*def hash = [name:"Andy", "VPN-#":45]
		 hash.each{ key, value ->
		 print "${key} : ${value} "
		 println key
		 }*/

		/*"ITERATION".each{ print it.toLowerCase() }*/
		def excite = { word -> return "${word}!!" }
		println(excite('Hello'))
		assert "Groovy!!" == excite("Groovy")
		assert "Java!!" == excite.call("Java")
	}
}
