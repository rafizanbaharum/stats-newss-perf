package my.gov.stats;

import my.gov.stats.config.StatsConfig;
import my.gov.stats.domain.LongColumnModel;
import my.gov.stats.domain.MediumColumnModel;
import my.gov.stats.domain.ModelDao;
import my.gov.stats.domain.ShortColumnModel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author rafizan.baharum
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {StatsConfig.class})
public class ModelDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

    private Logger log = LoggerFactory.getLogger(ModelDaoTest.class);

    @Autowired
    private ModelDao modelDao;

    @Before
    public void setUp() {

    }

    @Test
    @Rollback(value = false)
    public void testInsertShort() {
        for (int i = 0; i < 1000; i++) {
            ShortColumnModel shortModel = new ShortColumnModel();
            shortModel.setId(1L);
            shortModel.setInt1(1);
            shortModel.setInt2(2);
            shortModel.setInt3(3);
            shortModel.setInt4(4);
            shortModel.setInt5(5);
            shortModel.setInt6(6);
            shortModel.setInt7(7);
            shortModel.setInt8(9);
            shortModel.setInt9(9);
            shortModel.setInt10(10);
            shortModel.setString1("String1");
            shortModel.setString2("String2");
            shortModel.setString3("String3");
            shortModel.setString4("String4");
            shortModel.setString5("String5");
            shortModel.setString6("String6");
            shortModel.setString7("String7");
            shortModel.setString8("String8");
            shortModel.setString9("String9");
            shortModel.setString10("String10");
            modelDao.save(shortModel);
        }
    }

    @Test
    @Rollback(value = false)
    public void testInsertMedium() {
        for (int i = 0; i < 1000; i++) {
            MediumColumnModel mediumModel = new MediumColumnModel();
            mediumModel.setId(1L);
            mediumModel.setInt1(1);
            mediumModel.setInt2(2);
            mediumModel.setInt3(3);
            mediumModel.setInt4(4);
            mediumModel.setInt5(5);
            mediumModel.setInt6(6);
            mediumModel.setInt7(7);
            mediumModel.setInt8(9);
            mediumModel.setInt9(9);
            mediumModel.setInt10(10);
            mediumModel.setInt11(11);
            mediumModel.setInt12(12);
            mediumModel.setInt13(13);
            mediumModel.setInt14(14);
            mediumModel.setInt15(15);
            mediumModel.setInt16(16);
            mediumModel.setInt17(17);
            mediumModel.setInt18(18);
            mediumModel.setInt19(19);
            mediumModel.setInt20(20);
            mediumModel.setInt21(21);
            mediumModel.setInt22(22);
            mediumModel.setInt23(23);
            mediumModel.setInt24(24);
            mediumModel.setInt25(25);
            mediumModel.setInt26(26);
            mediumModel.setInt27(27);
            mediumModel.setInt28(28);
            mediumModel.setInt29(29);
            mediumModel.setInt30(30);
            mediumModel.setInt31(31);
            mediumModel.setInt32(32);
            mediumModel.setInt33(33);
            mediumModel.setInt34(34);
            mediumModel.setInt35(35);
            mediumModel.setInt36(36);
            mediumModel.setInt37(37);
            mediumModel.setInt38(38);
            mediumModel.setInt39(39);
            mediumModel.setInt40(40);
            mediumModel.setString1("String1");
            mediumModel.setString2("String2");
            mediumModel.setString3("String3");
            mediumModel.setString4("String4");
            mediumModel.setString5("String5");
            mediumModel.setString6("String6");
            mediumModel.setString7("String7");
            mediumModel.setString8("String8");
            mediumModel.setString9("String9");
            mediumModel.setString10("String10");
            mediumModel.setString11("String11");
            mediumModel.setString12("String12");
            mediumModel.setString13("String13");
            mediumModel.setString14("String14");
            mediumModel.setString15("String15");
            mediumModel.setString16("String16");
            mediumModel.setString17("String17");
            mediumModel.setString18("String18");
            mediumModel.setString19("String19");
            mediumModel.setString20("String20");
            mediumModel.setString21("String21");
            mediumModel.setString22("String22");
            mediumModel.setString23("String23");
            mediumModel.setString24("String24");
            mediumModel.setString25("String25");
            mediumModel.setString26("String26");
            mediumModel.setString27("String27");
            mediumModel.setString28("String28");
            mediumModel.setString29("String29");
            mediumModel.setString30("String30");
            mediumModel.setString31("String31");
            mediumModel.setString32("String32");
            mediumModel.setString33("String33");
            mediumModel.setString34("String34");
            mediumModel.setString35("String35");
            mediumModel.setString36("String36");
            mediumModel.setString37("String37");
            mediumModel.setString38("String38");
            mediumModel.setString39("String39");
            mediumModel.setString40("String40");
            modelDao.save(mediumModel);
        }
    }

    @Test
    @Rollback(value = false)
    public void testInsertLong() {
        for (int i = 0; i < 1000; i++) {
            LongColumnModel longModel = new LongColumnModel();
            longModel.setId(1L);
            longModel.setInt1(1);
            longModel.setInt2(2);
            longModel.setInt3(3);
            longModel.setInt4(4);
            longModel.setInt5(5);
            longModel.setInt6(6);
            longModel.setInt7(7);
            longModel.setInt8(9);
            longModel.setInt9(9);
            longModel.setInt10(10);
            longModel.setInt11(11);
            longModel.setInt12(12);
            longModel.setInt13(13);
            longModel.setInt14(14);
            longModel.setInt15(15);
            longModel.setInt16(16);
            longModel.setInt17(17);
            longModel.setInt18(18);
            longModel.setInt19(19);
            longModel.setInt20(20);
            longModel.setInt21(21);
            longModel.setInt22(22);
            longModel.setInt23(23);
            longModel.setInt24(24);
            longModel.setInt25(25);
            longModel.setInt26(26);
            longModel.setInt27(27);
            longModel.setInt28(28);
            longModel.setInt29(29);
            longModel.setInt30(30);
            longModel.setInt31(31);
            longModel.setInt32(32);
            longModel.setInt33(33);
            longModel.setInt34(34);
            longModel.setInt35(35);
            longModel.setInt36(36);
            longModel.setInt37(37);
            longModel.setInt38(38);
            longModel.setInt39(39);
            longModel.setInt40(40);
            longModel.setInt41(11);
            longModel.setInt42(12);
            longModel.setInt43(13);
            longModel.setInt44(14);
            longModel.setInt45(15);
            longModel.setInt46(16);
            longModel.setInt47(17);
            longModel.setInt48(18);
            longModel.setInt49(19);
            longModel.setInt50(20);
            longModel.setInt51(21);
            longModel.setInt52(22);
            longModel.setInt53(23);
            longModel.setInt54(24);
            longModel.setInt55(25);
            longModel.setInt56(26);
            longModel.setInt57(27);
            longModel.setInt58(28);
            longModel.setInt59(29);
            longModel.setInt60(30);
            longModel.setInt61(31);
            longModel.setInt62(32);
            longModel.setInt63(33);
            longModel.setInt64(34);
            longModel.setInt65(35);
            longModel.setInt66(36);
            longModel.setInt67(37);
            longModel.setInt68(38);
            longModel.setInt69(39);
            longModel.setInt70(40);
            longModel.setInt71(11);
            longModel.setInt72(12);
            longModel.setInt73(13);
            longModel.setInt74(14);
            longModel.setInt75(15);
            longModel.setInt76(16);
            longModel.setInt77(17);
            longModel.setInt78(18);
            longModel.setInt79(19);
            longModel.setInt80(20);
            longModel.setInt81(21);
            longModel.setInt82(22);
            longModel.setInt83(23);
            longModel.setInt84(24);
            longModel.setInt85(25);
            longModel.setInt86(26);
            longModel.setInt87(27);
            longModel.setInt88(28);
            longModel.setInt89(29);
            longModel.setInt90(30);
            longModel.setInt91(31);
            longModel.setInt92(32);
            longModel.setInt93(33);
            longModel.setInt94(34);
            longModel.setInt95(35);
            longModel.setInt96(36);
            longModel.setInt97(37);
            longModel.setInt98(38);
            longModel.setInt99(39);
            longModel.setInt100(40);
            longModel.setString1("String1");
            longModel.setString2("String2");
            longModel.setString3("String3");
            longModel.setString4("String4");
            longModel.setString5("String5");
            longModel.setString6("String6");
            longModel.setString7("String7");
            longModel.setString8("String8");
            longModel.setString9("String9");
            longModel.setString10("String10");
            longModel.setString11("String11");
            longModel.setString12("String12");
            longModel.setString13("String13");
            longModel.setString14("String14");
            longModel.setString15("String15");
            longModel.setString16("String16");
            longModel.setString17("String17");
            longModel.setString18("String18");
            longModel.setString19("String19");
            longModel.setString20("String20");
            longModel.setString21("String21");
            longModel.setString22("String22");
            longModel.setString23("String23");
            longModel.setString24("String24");
            longModel.setString25("String25");
            longModel.setString26("String26");
            longModel.setString27("String27");
            longModel.setString28("String28");
            longModel.setString29("String29");
            longModel.setString30("String30");
            longModel.setString31("String31");
            longModel.setString32("String32");
            longModel.setString33("String33");
            longModel.setString34("String34");
            longModel.setString35("String35");
            longModel.setString36("String36");
            longModel.setString37("String37");
            longModel.setString38("String38");
            longModel.setString39("String39");
            longModel.setString40("String40");
            longModel.setString41("String11");
            longModel.setString42("String12");
            longModel.setString43("String13");
            longModel.setString44("String14");
            longModel.setString45("String15");
            longModel.setString46("String16");
            longModel.setString47("String17");
            longModel.setString48("String18");
            longModel.setString49("String19");
            longModel.setString40("String20");
            longModel.setString41("String21");
            longModel.setString42("String22");
            longModel.setString43("String23");
            longModel.setString44("String24");
            longModel.setString45("String25");
            longModel.setString46("String26");
            longModel.setString47("String27");
            longModel.setString48("String28");
            longModel.setString49("String29");
            longModel.setString50("String30");
            longModel.setString51("String31");
            longModel.setString52("String32");
            longModel.setString53("String33");
            longModel.setString54("String34");
            longModel.setString55("String35");
            longModel.setString56("String36");
            longModel.setString57("String37");
            longModel.setString58("String38");
            longModel.setString59("String39");
            longModel.setString60("String40");
            longModel.setString61("String11");
            longModel.setString62("String12");
            longModel.setString63("String13");
            longModel.setString64("String14");
            longModel.setString65("String15");
            longModel.setString66("String16");
            longModel.setString67("String17");
            longModel.setString68("String18");
            longModel.setString69("String19");
            longModel.setString70("String20");
            longModel.setString71("String21");
            longModel.setString72("String22");
            longModel.setString73("String23");
            longModel.setString74("String24");
            longModel.setString75("String25");
            longModel.setString76("String26");
            longModel.setString77("String27");
            longModel.setString78("String28");
            longModel.setString79("String29");
            longModel.setString80("String30");
            longModel.setString81("String31");
            longModel.setString82("String32");
            longModel.setString83("String33");
            longModel.setString84("String34");
            longModel.setString85("String35");
            longModel.setString86("String36");
            longModel.setString87("String37");
            longModel.setString88("String38");
            longModel.setString89("String39");
            longModel.setString90("String40");
            longModel.setString91("String11");
            longModel.setString92("String12");
            longModel.setString93("String13");
            longModel.setString94("String14");
            longModel.setString95("String15");
            longModel.setString96("String16");
            longModel.setString97("String17");
            longModel.setString98("String18");
            longModel.setString99("String19");
            longModel.setString100("String20");
            modelDao.save(longModel);
        }
    }

    @Test
    @Rollback(value = true)
    public void testQuery() {
        modelDao.warmUp();

        long now = System.currentTimeMillis();
        ShortColumnModel smodel = modelDao.findByShortColumnId(21L);
        long then = System.currentTimeMillis();
        log.debug("delta: " + ((then - now)));

         now = System.currentTimeMillis();
        MediumColumnModel mmodel = modelDao.findByMediumColumnId(31L);
         then = System.currentTimeMillis();
        log.debug("delta: " + ((then - now)));

        now = System.currentTimeMillis();
        LongColumnModel lmodel = modelDao.findByLongColumnId(13L);
        then = System.currentTimeMillis();
        log.debug("delta: " + ((then - now)));
    }

}
