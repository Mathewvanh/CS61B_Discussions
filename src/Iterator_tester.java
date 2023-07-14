public class Iterator_tester {
    OHRequest d4 = new OHRequest("help me","four",null);
    OHRequest d3 = new OHRequest("im bored","three",d4);
    OHRequest d2 = new OHRequest("thank u","two",d3);
    OHRequest d1 = new OHRequest("thank u","one",d2);
    OHRequest[] x = new OHRequest[]{d1,d2,d3,d4};
}
