package com.nit.test;

import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.nit.test")
//@SelectClasses({ BankOperationsServiceTest.class, MoreOperationsServiceTest.class })
//@TestClassOrder(ClassOrderer.DisplayName.class)
//@TestClassOrder(ClassOrderer.OrderAnnotation.class)
//@TestClassOrder(ClassOrderer.ClassName.class)
@TestClassOrder(ClassOrderer.Random.class)

public class AllTests {

}
