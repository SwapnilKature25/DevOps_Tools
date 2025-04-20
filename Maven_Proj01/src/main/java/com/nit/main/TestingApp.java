package com.nit.main;

import com.nit.service.Arithmetic;

public class TestingApp {
	public static void main(String[] args) {
		Arithmetic a = new Arithmetic();
		System.out.println("result : "+a.sum(10,20));
	}
}



/* after executing maven project through maven :
[INFO] Scanning for projects...
[INFO] 
[INFO] [1m------------------------< [0;36morg.nit:Maven_Proj01[0;1m >------------------------[m
[INFO] [1mBuilding Maven_Proj01 0.0.1-SNAPSHOT[m
[INFO]   from pom.xml
[INFO] [1m--------------------------------[ jar ]---------------------------------[m
[INFO] 
[INFO] [1m--- [0;32mexec:3.5.0:java[m [1m(default-cli)[m @ [36mMaven_Proj01[0;1m ---[m
result : 30
[INFO] [1m------------------------------------------------------------------------[m
[INFO] [1;32mBUILD SUCCESS[m
[INFO] [1m------------------------------------------------------------------------[m
[INFO] Total time:  1.342 s
[INFO] Finished at: 2025-04-20T16:27:47+05:30
[INFO] [1m------------------------------------------------------------------------[m
 */