package us.illyohs.civilmagiks.common.sigil;

public class ModSigil {

    public static BaseSigil testSigil;

    public static void init() {
        testSigil = new TestSigil("name", 1, "stormsigil");
    }
}
