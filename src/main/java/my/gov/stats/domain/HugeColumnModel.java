package my.gov.stats.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author rafizan.baharum
 * @since 9/5/13
 */
@Entity(name = "HugeColumnModel")
@Table(name = "HCM")
public class HugeColumnModel implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(generator = "SEQ_HCM")
    @SequenceGenerator(name = "SEQ_HCM", sequenceName = "SEQ_HCM", allocationSize = 1)
    private Long id;

    @Column
    private String str1;
    @Column
    private String str2;
    @Column
    private String str3;
    @Column
    private String str4;
    @Column
    private String str5;
    @Column
    private String str6;
    @Column
    private String str7;
    @Column
    private String str8;
    @Column
    private String str9;
    @Column
    private String str10;
    @Column
    private String str11;
    @Column
    private String str12;
    @Column
    private String str13;
    @Column
    private String str14;
    @Column
    private String str15;
    @Column
    private String str16;
    @Column
    private String str17;
    @Column
    private String str18;
    @Column
    private String str19;
    @Column
    private String str20;
    @Column
    private String str21;
    @Column
    private String str22;
    @Column
    private String str23;
    @Column
    private String str24;
    @Column
    private String str25;
    @Column
    private String str26;
    @Column
    private String str27;
    @Column
    private String str28;
    @Column
    private String str29;
    @Column
    private String str30;
    @Column
    private String str31;
    @Column
    private String str32;
    @Column
    private String str33;
    @Column
    private String str34;
    @Column
    private String str35;
    @Column
    private String str36;
    @Column
    private String str37;
    @Column
    private String str38;
    @Column
    private String str39;
    @Column
    private String str40;
    @Column
    private String str41;
    @Column
    private String str42;
    @Column
    private String str43;
    @Column
    private String str44;
    @Column
    private String str45;
    @Column
    private String str46;
    @Column
    private String str47;
    @Column
    private String str48;
    @Column
    private String str49;
    @Column
    private String str50;
    @Column
    private String str51;
    @Column
    private String str52;
    @Column
    private String str53;
    @Column
    private String str54;
    @Column
    private String str55;
    @Column
    private String str56;
    @Column
    private String str57;
    @Column
    private String str58;
    @Column
    private String str59;
    @Column
    private String str60;
    @Column
    private String str61;
    @Column
    private String str62;
    @Column
    private String str63;
    @Column
    private String str64;
    @Column
    private String str65;
    @Column
    private String str66;
    @Column
    private String str67;
    @Column
    private String str68;
    @Column
    private String str69;
    @Column
    private String str70;
    @Column
    private String str71;
    @Column
    private String str72;
    @Column
    private String str73;
    @Column
    private String str74;
    @Column
    private String str75;
    @Column
    private String str76;
    @Column
    private String str77;
    @Column
    private String str78;
    @Column
    private String str79;
    @Column
    private String str80;
    @Column
    private String str81;
    @Column
    private String str82;
    @Column
    private String str83;
    @Column
    private String str84;
    @Column
    private String str85;
    @Column
    private String str86;
    @Column
    private String str87;
    @Column
    private String str88;
    @Column
    private String str89;
    @Column
    private String str90;
    @Column
    private String str91;
    @Column
    private String str92;
    @Column
    private String str93;
    @Column
    private String str94;
    @Column
    private String str95;
    @Column
    private String str96;
    @Column
    private String str97;
    @Column
    private String str98;
    @Column
    private String str99;
    @Column
    private String str100;
    @Column
    private String str101;
    @Column
    private String str102;
    @Column
    private String str103;
    @Column
    private String str104;
    @Column
    private String str105;
    @Column
    private String str106;
    @Column
    private String str107;
    @Column
    private String str108;
    @Column
    private String str109;
    @Column
    private String str110;
    @Column
    private String str111;
    @Column
    private String str112;
    @Column
    private String str113;
    @Column
    private String str114;
    @Column
    private String str115;
    @Column
    private String str116;
    @Column
    private String str117;
    @Column
    private String str118;
    @Column
    private String str119;
    @Column
    private String str120;
    @Column
    private String str121;
    @Column
    private String str122;
    @Column
    private String str123;
    @Column
    private String str124;
    @Column
    private String str125;
    @Column
    private String str126;
    @Column
    private String str127;
    @Column
    private String str128;
    @Column
    private String str129;
    @Column
    private String str130;
    @Column
    private String str131;
    @Column
    private String str132;
    @Column
    private String str133;
    @Column
    private String str134;
    @Column
    private String str135;
    @Column
    private String str136;
    @Column
    private String str137;
    @Column
    private String str138;
    @Column
    private String str139;
    @Column
    private String str140;
    @Column
    private String str141;
    @Column
    private String str142;
    @Column
    private String str143;
    @Column
    private String str144;
    @Column
    private String str145;
    @Column
    private String str146;
    @Column
    private String str147;
    @Column
    private String str148;
    @Column
    private String str149;
    @Column
    private String str150;
    @Column
    private String str151;
    @Column
    private String str152;
    @Column
    private String str153;
    @Column
    private String str154;
    @Column
    private String str155;
    @Column
    private String str156;
    @Column
    private String str157;
    @Column
    private String str158;
    @Column
    private String str159;
    @Column
    private String str160;
    @Column
    private String str161;
    @Column
    private String str162;
    @Column
    private String str163;
    @Column
    private String str164;
    @Column
    private String str165;
    @Column
    private String str166;
    @Column
    private String str167;
    @Column
    private String str168;
    @Column
    private String str169;
    @Column
    private String str170;
    @Column
    private String str171;
    @Column
    private String str172;
    @Column
    private String str173;
    @Column
    private String str174;
    @Column
    private String str175;
    @Column
    private String str176;
    @Column
    private String str177;
    @Column
    private String str178;
    @Column
    private String str179;
    @Column
    private String str180;
    @Column
    private String str181;
    @Column
    private String str182;
    @Column
    private String str183;
    @Column
    private String str184;
    @Column
    private String str185;
    @Column
    private String str186;
    @Column
    private String str187;
    @Column
    private String str188;
    @Column
    private String str189;
    @Column
    private String str190;
    @Column
    private String str191;
    @Column
    private String str192;
    @Column
    private String str193;
    @Column
    private String str194;
    @Column
    private String str195;
    @Column
    private String str196;
    @Column
    private String str197;
    @Column
    private String str198;
    @Column
    private String str199;
    @Column
    private String str200;
    @Column
    private String str201;
    @Column
    private String str202;
    @Column
    private String str203;
    @Column
    private String str204;
    @Column
    private String str205;
    @Column
    private String str206;
    @Column
    private String str207;
    @Column
    private String str208;
    @Column
    private String str209;
    @Column
    private String str210;
    @Column
    private String str211;
    @Column
    private String str212;
    @Column
    private String str213;
    @Column
    private String str214;
    @Column
    private String str215;
    @Column
    private String str216;
    @Column
    private String str217;
    @Column
    private String str218;
    @Column
    private String str219;
    @Column
    private String str220;
    @Column
    private String str221;
    @Column
    private String str222;
    @Column
    private String str223;
    @Column
    private String str224;
    @Column
    private String str225;
    @Column
    private String str226;
    @Column
    private String str227;
    @Column
    private String str228;
    @Column
    private String str229;
    @Column
    private String str230;
    @Column
    private String str231;
    @Column
    private String str232;
    @Column
    private String str233;
    @Column
    private String str234;
    @Column
    private String str235;
    @Column
    private String str236;
    @Column
    private String str237;
    @Column
    private String str238;
    @Column
    private String str239;
    @Column
    private String str240;
    @Column
    private String str241;
    @Column
    private String str242;
    @Column
    private String str243;
    @Column
    private String str244;
    @Column
    private String str245;
    @Column
    private String str246;
    @Column
    private String str247;
    @Column
    private String str248;
    @Column
    private String str249;
    @Column
    private String str250;
    @Column
    private String str251;
    @Column
    private String str252;
    @Column
    private String str253;
    @Column
    private String str254;
    @Column
    private String str255;
    @Column
    private String str256;
    @Column
    private String str257;
    @Column
    private String str258;
    @Column
    private String str259;
    @Column
    private String str260;
    @Column
    private String str261;
    @Column
    private String str262;
    @Column
    private String str263;
    @Column
    private String str264;
    @Column
    private String str265;
    @Column
    private String str266;
    @Column
    private String str267;
    @Column
    private String str268;
    @Column
    private String str269;
    @Column
    private String str270;
    @Column
    private String str271;
    @Column
    private String str272;
    @Column
    private String str273;
    @Column
    private String str274;
    @Column
    private String str275;
    @Column
    private String str276;
    @Column
    private String str277;
    @Column
    private String str278;
    @Column
    private String str279;
    @Column
    private String str280;
    @Column
    private String str281;
    @Column
    private String str282;
    @Column
    private String str283;
    @Column
    private String str284;
    @Column
    private String str285;
    @Column
    private String str286;
    @Column
    private String str287;
    @Column
    private String str288;
    @Column
    private String str289;
    @Column
    private String str290;
    @Column
    private String str291;
    @Column
    private String str292;
    @Column
    private String str293;
    @Column
    private String str294;
    @Column
    private String str295;
    @Column
    private String str296;
    @Column
    private String str297;
    @Column
    private String str298;
    @Column
    private String str299;
    @Column
    private String str300;
    @Column
    private String str301;
    @Column
    private String str302;
    @Column
    private String str303;
    @Column
    private String str304;
    @Column
    private String str305;
    @Column
    private String str306;
    @Column
    private String str307;
    @Column
    private String str308;
    @Column
    private String str309;
    @Column
    private String str310;
    @Column
    private String str311;
    @Column
    private String str312;
    @Column
    private String str313;
    @Column
    private String str314;
    @Column
    private String str315;
    @Column
    private String str316;
    @Column
    private String str317;
    @Column
    private String str318;
    @Column
    private String str319;
    @Column
    private String str320;
    @Column
    private String str321;
    @Column
    private String str322;
    @Column
    private String str323;
    @Column
    private String str324;
    @Column
    private String str325;
    @Column
    private String str326;
    @Column
    private String str327;
    @Column
    private String str328;
    @Column
    private String str329;
    @Column
    private String str330;
    @Column
    private String str331;
    @Column
    private String str332;
    @Column
    private String str333;
    @Column
    private String str334;
    @Column
    private String str335;
    @Column
    private String str336;
    @Column
    private String str337;
    @Column
    private String str338;
    @Column
    private String str339;
    @Column
    private String str340;
    @Column
    private String str341;
    @Column
    private String str342;
    @Column
    private String str343;
    @Column
    private String str344;
    @Column
    private String str345;
    @Column
    private String str346;
    @Column
    private String str347;
    @Column
    private String str348;
    @Column
    private String str349;
    @Column
    private String str350;
    @Column
    private String str351;
    @Column
    private String str352;
    @Column
    private String str353;
    @Column
    private String str354;
    @Column
    private String str355;
    @Column
    private String str356;
    @Column
    private String str357;
    @Column
    private String str358;
    @Column
    private String str359;
    @Column
    private String str360;
    @Column
    private String str361;
    @Column
    private String str362;
    @Column
    private String str363;
    @Column
    private String str364;
    @Column
    private String str365;
    @Column
    private String str366;
    @Column
    private String str367;
    @Column
    private String str368;
    @Column
    private String str369;
    @Column
    private String str370;
    @Column
    private String str371;
    @Column
    private String str372;
    @Column
    private String str373;
    @Column
    private String str374;
    @Column
    private String str375;
    @Column
    private String str376;
    @Column
    private String str377;
    @Column
    private String str378;
    @Column
    private String str379;
    @Column
    private String str380;
    @Column
    private String str381;
    @Column
    private String str382;
    @Column
    private String str383;
    @Column
    private String str384;
    @Column
    private String str385;
    @Column
    private String str386;
    @Column
    private String str387;
    @Column
    private String str388;
    @Column
    private String str389;
    @Column
    private String str390;
    @Column
    private String str391;
    @Column
    private String str392;
    @Column
    private String str393;
    @Column
    private String str394;
    @Column
    private String str395;
    @Column
    private String str396;
    @Column
    private String str397;
    @Column
    private String str398;
    @Column
    private String str399;
    @Column
    private String str400;
    @Column
    private String str401;
    @Column
    private String str402;
    @Column
    private String str403;
    @Column
    private String str404;
    @Column
    private String str405;
    @Column
    private String str406;
    @Column
    private String str407;
    @Column
    private String str408;
    @Column
    private String str409;
    @Column
    private String str410;
    @Column
    private String str411;
    @Column
    private String str412;
    @Column
    private String str413;
    @Column
    private String str414;
    @Column
    private String str415;
    @Column
    private String str416;
    @Column
    private String str417;
    @Column
    private String str418;
    @Column
    private String str419;
    @Column
    private String str420;
    @Column
    private String str421;
    @Column
    private String str422;
    @Column
    private String str423;
    @Column
    private String str424;
    @Column
    private String str425;
    @Column
    private String str426;
    @Column
    private String str427;
    @Column
    private String str428;
    @Column
    private String str429;
    @Column
    private String str430;
    @Column
    private String str431;
    @Column
    private String str432;
    @Column
    private String str433;
    @Column
    private String str434;
    @Column
    private String str435;
    @Column
    private String str436;
    @Column
    private String str437;
    @Column
    private String str438;
    @Column
    private String str439;
    @Column
    private String str440;
    @Column
    private String str441;
    @Column
    private String str442;
    @Column
    private String str443;
    @Column
    private String str444;
    @Column
    private String str445;
    @Column
    private String str446;
    @Column
    private String str447;
    @Column
    private String str448;
    @Column
    private String str449;
    @Column
    private String str450;
    @Column
    private String str451;
    @Column
    private String str452;
    @Column
    private String str453;
    @Column
    private String str454;
    @Column
    private String str455;
    @Column
    private String str456;
    @Column
    private String str457;
    @Column
    private String str458;
    @Column
    private String str459;
    @Column
    private String str460;
    @Column
    private String str461;
    @Column
    private String str462;
    @Column
    private String str463;
    @Column
    private String str464;
    @Column
    private String str465;
    @Column
    private String str466;
    @Column
    private String str467;
    @Column
    private String str468;
    @Column
    private String str469;
    @Column
    private String str470;
    @Column
    private String str471;
    @Column
    private String str472;
    @Column
    private String str473;
    @Column
    private String str474;
    @Column
    private String str475;
    @Column
    private String str476;
    @Column
    private String str477;
    @Column
    private String str478;
    @Column
    private String str479;
    @Column
    private String str480;
    @Column
    private String str481;
    @Column
    private String str482;
    @Column
    private String str483;
    @Column
    private String str484;
    @Column
    private String str485;
    @Column
    private String str486;
    @Column
    private String str487;
    @Column
    private String str488;
    @Column
    private String str489;
    @Column
    private String str490;
    @Column
    private String str491;
    @Column
    private String str492;
    @Column
    private String str493;
    @Column
    private String str494;
    @Column
    private String str495;
    @Column
    private String str496;
    @Column
    private String str497;
    @Column
    private String str498;
    @Column
    private int int1;
    @Column
    private int int2;
    @Column
    private int int3;
    @Column
    private int int4;
    @Column
    private int int5;
    @Column
    private int int6;
    @Column
    private int int7;
    @Column
    private int int8;
    @Column
    private int int9;
    @Column
    private int int10;
    @Column
    private int int11;
    @Column
    private int int12;
    @Column
    private int int13;
    @Column
    private int int14;
    @Column
    private int int15;
    @Column
    private int int16;
    @Column
    private int int17;
    @Column
    private int int18;
    @Column
    private int int19;
    @Column
    private int int20;
    @Column
    private int int21;
    @Column
    private int int22;
    @Column
    private int int23;
    @Column
    private int int24;
    @Column
    private int int25;
    @Column
    private int int26;
    @Column
    private int int27;
    @Column
    private int int28;
    @Column
    private int int29;
    @Column
    private int int30;
    @Column
    private int int31;
    @Column
    private int int32;
    @Column
    private int int33;
    @Column
    private int int34;
    @Column
    private int int35;
    @Column
    private int int36;
    @Column
    private int int37;
    @Column
    private int int38;
    @Column
    private int int39;
    @Column
    private int int40;
    @Column
    private int int41;
    @Column
    private int int42;
    @Column
    private int int43;
    @Column
    private int int44;
    @Column
    private int int45;
    @Column
    private int int46;
    @Column
    private int int47;
    @Column
    private int int48;
    @Column
    private int int49;
    @Column
    private int int50;
    @Column
    private int int51;
    @Column
    private int int52;
    @Column
    private int int53;
    @Column
    private int int54;
    @Column
    private int int55;
    @Column
    private int int56;
    @Column
    private int int57;
    @Column
    private int int58;
    @Column
    private int int59;
    @Column
    private int int60;
    @Column
    private int int61;
    @Column
    private int int62;
    @Column
    private int int63;
    @Column
    private int int64;
    @Column
    private int int65;
    @Column
    private int int66;
    @Column
    private int int67;
    @Column
    private int int68;
    @Column
    private int int69;
    @Column
    private int int70;
    @Column
    private int int71;
    @Column
    private int int72;
    @Column
    private int int73;
    @Column
    private int int74;
    @Column
    private int int75;
    @Column
    private int int76;
    @Column
    private int int77;
    @Column
    private int int78;
    @Column
    private int int79;
    @Column
    private int int80;
    @Column
    private int int81;
    @Column
    private int int82;
    @Column
    private int int83;
    @Column
    private int int84;
    @Column
    private int int85;
    @Column
    private int int86;
    @Column
    private int int87;
    @Column
    private int int88;
    @Column
    private int int89;
    @Column
    private int int90;
    @Column
    private int int91;
    @Column
    private int int92;
    @Column
    private int int93;
    @Column
    private int int94;
    @Column
    private int int95;
    @Column
    private int int96;
    @Column
    private int int97;
    @Column
    private int int98;
    @Column
    private int int99;
    @Column
    private int int100;
    @Column
    private int int101;
    @Column
    private int int102;
    @Column
    private int int103;
    @Column
    private int int104;
    @Column
    private int int105;
    @Column
    private int int106;
    @Column
    private int int107;
    @Column
    private int int108;
    @Column
    private int int109;
    @Column
    private int int110;
    @Column
    private int int111;
    @Column
    private int int112;
    @Column
    private int int113;
    @Column
    private int int114;
    @Column
    private int int115;
    @Column
    private int int116;
    @Column
    private int int117;
    @Column
    private int int118;
    @Column
    private int int119;
    @Column
    private int int120;
    @Column
    private int int121;
    @Column
    private int int122;
    @Column
    private int int123;
    @Column
    private int int124;
    @Column
    private int int125;
    @Column
    private int int126;
    @Column
    private int int127;
    @Column
    private int int128;
    @Column
    private int int129;
    @Column
    private int int130;
    @Column
    private int int131;
    @Column
    private int int132;
    @Column
    private int int133;
    @Column
    private int int134;
    @Column
    private int int135;
    @Column
    private int int136;
    @Column
    private int int137;
    @Column
    private int int138;
    @Column
    private int int139;
    @Column
    private int int140;
    @Column
    private int int141;
    @Column
    private int int142;
    @Column
    private int int143;
    @Column
    private int int144;
    @Column
    private int int145;
    @Column
    private int int146;
    @Column
    private int int147;
    @Column
    private int int148;
    @Column
    private int int149;
    @Column
    private int int150;
    @Column
    private int int151;
    @Column
    private int int152;
    @Column
    private int int153;
    @Column
    private int int154;
    @Column
    private int int155;
    @Column
    private int int156;
    @Column
    private int int157;
    @Column
    private int int158;
    @Column
    private int int159;
    @Column
    private int int160;
    @Column
    private int int161;
    @Column
    private int int162;
    @Column
    private int int163;
    @Column
    private int int164;
    @Column
    private int int165;
    @Column
    private int int166;
    @Column
    private int int167;
    @Column
    private int int168;
    @Column
    private int int169;
    @Column
    private int int170;
    @Column
    private int int171;
    @Column
    private int int172;
    @Column
    private int int173;
    @Column
    private int int174;
    @Column
    private int int175;
    @Column
    private int int176;
    @Column
    private int int177;
    @Column
    private int int178;
    @Column
    private int int179;
    @Column
    private int int180;
    @Column
    private int int181;
    @Column
    private int int182;
    @Column
    private int int183;
    @Column
    private int int184;
    @Column
    private int int185;
    @Column
    private int int186;
    @Column
    private int int187;
    @Column
    private int int188;
    @Column
    private int int189;
    @Column
    private int int190;
    @Column
    private int int191;
    @Column
    private int int192;
    @Column
    private int int193;
    @Column
    private int int194;
    @Column
    private int int195;
    @Column
    private int int196;
    @Column
    private int int197;
    @Column
    private int int198;
    @Column
    private int int199;
    @Column
    private int int200;
    @Column
    private int int201;
    @Column
    private int int202;
    @Column
    private int int203;
    @Column
    private int int204;
    @Column
    private int int205;
    @Column
    private int int206;
    @Column
    private int int207;
    @Column
    private int int208;
    @Column
    private int int209;
    @Column
    private int int210;
    @Column
    private int int211;
    @Column
    private int int212;
    @Column
    private int int213;
    @Column
    private int int214;
    @Column
    private int int215;
    @Column
    private int int216;
    @Column
    private int int217;
    @Column
    private int int218;
    @Column
    private int int219;
    @Column
    private int int220;
    @Column
    private int int221;
    @Column
    private int int222;
    @Column
    private int int223;
    @Column
    private int int224;
    @Column
    private int int225;
    @Column
    private int int226;
    @Column
    private int int227;
    @Column
    private int int228;
    @Column
    private int int229;
    @Column
    private int int230;
    @Column
    private int int231;
    @Column
    private int int232;
    @Column
    private int int233;
    @Column
    private int int234;
    @Column
    private int int235;
    @Column
    private int int236;
    @Column
    private int int237;
    @Column
    private int int238;
    @Column
    private int int239;
    @Column
    private int int240;
    @Column
    private int int241;
    @Column
    private int int242;
    @Column
    private int int243;
    @Column
    private int int244;
    @Column
    private int int245;
    @Column
    private int int246;
    @Column
    private int int247;
    @Column
    private int int248;
    @Column
    private int int249;
    @Column
    private int int250;
    @Column
    private int int251;
    @Column
    private int int252;
    @Column
    private int int253;
    @Column
    private int int254;
    @Column
    private int int255;
    @Column
    private int int256;
    @Column
    private int int257;
    @Column
    private int int258;
    @Column
    private int int259;
    @Column
    private int int260;
    @Column
    private int int261;
    @Column
    private int int262;
    @Column
    private int int263;
    @Column
    private int int264;
    @Column
    private int int265;
    @Column
    private int int266;
    @Column
    private int int267;
    @Column
    private int int268;
    @Column
    private int int269;
    @Column
    private int int270;
    @Column
    private int int271;
    @Column
    private int int272;
    @Column
    private int int273;
    @Column
    private int int274;
    @Column
    private int int275;
    @Column
    private int int276;
    @Column
    private int int277;
    @Column
    private int int278;
    @Column
    private int int279;
    @Column
    private int int280;
    @Column
    private int int281;
    @Column
    private int int282;
    @Column
    private int int283;
    @Column
    private int int284;
    @Column
    private int int285;
    @Column
    private int int286;
    @Column
    private int int287;
    @Column
    private int int288;
    @Column
    private int int289;
    @Column
    private int int290;
    @Column
    private int int291;
    @Column
    private int int292;
    @Column
    private int int293;
    @Column
    private int int294;
    @Column
    private int int295;
    @Column
    private int int296;
    @Column
    private int int297;
    @Column
    private int int298;
    @Column
    private int int299;
    @Column
    private int int300;
    @Column
    private int int301;
    @Column
    private int int302;
    @Column
    private int int303;
    @Column
    private int int304;
    @Column
    private int int305;
    @Column
    private int int306;
    @Column
    private int int307;
    @Column
    private int int308;
    @Column
    private int int309;
    @Column
    private int int310;
    @Column
    private int int311;
    @Column
    private int int312;
    @Column
    private int int313;
    @Column
    private int int314;
    @Column
    private int int315;
    @Column
    private int int316;
    @Column
    private int int317;
    @Column
    private int int318;
    @Column
    private int int319;
    @Column
    private int int320;
    @Column
    private int int321;
    @Column
    private int int322;
    @Column
    private int int323;
    @Column
    private int int324;
    @Column
    private int int325;
    @Column
    private int int326;
    @Column
    private int int327;
    @Column
    private int int328;
    @Column
    private int int329;
    @Column
    private int int330;
    @Column
    private int int331;
    @Column
    private int int332;
    @Column
    private int int333;
    @Column
    private int int334;
    @Column
    private int int335;
    @Column
    private int int336;
    @Column
    private int int337;
    @Column
    private int int338;
    @Column
    private int int339;
    @Column
    private int int340;
    @Column
    private int int341;
    @Column
    private int int342;
    @Column
    private int int343;
    @Column
    private int int344;
    @Column
    private int int345;
    @Column
    private int int346;
    @Column
    private int int347;
    @Column
    private int int348;
    @Column
    private int int349;
    @Column
    private int int350;
    @Column
    private int int351;
    @Column
    private int int352;
    @Column
    private int int353;
    @Column
    private int int354;
    @Column
    private int int355;
    @Column
    private int int356;
    @Column
    private int int357;
    @Column
    private int int358;
    @Column
    private int int359;
    @Column
    private int int360;
    @Column
    private int int361;
    @Column
    private int int362;
    @Column
    private int int363;
    @Column
    private int int364;
    @Column
    private int int365;
    @Column
    private int int366;
    @Column
    private int int367;
    @Column
    private int int368;
    @Column
    private int int369;
    @Column
    private int int370;
    @Column
    private int int371;
    @Column
    private int int372;
    @Column
    private int int373;
    @Column
    private int int374;
    @Column
    private int int375;
    @Column
    private int int376;
    @Column
    private int int377;
    @Column
    private int int378;
    @Column
    private int int379;
    @Column
    private int int380;
    @Column
    private int int381;
    @Column
    private int int382;
    @Column
    private int int383;
    @Column
    private int int384;
    @Column
    private int int385;
    @Column
    private int int386;
    @Column
    private int int387;
    @Column
    private int int388;
    @Column
    private int int389;
    @Column
    private int int390;
    @Column
    private int int391;
    @Column
    private int int392;
    @Column
    private int int393;
    @Column
    private int int394;
    @Column
    private int int395;
    @Column
    private int int396;
    @Column
    private int int397;
    @Column
    private int int398;
    @Column
    private int int399;
    @Column
    private int int400;
    @Column
    private int int401;
    @Column
    private int int402;
    @Column
    private int int403;
    @Column
    private int int404;
    @Column
    private int int405;
    @Column
    private int int406;
    @Column
    private int int407;
    @Column
    private int int408;
    @Column
    private int int409;
    @Column
    private int int410;
    @Column
    private int int411;
    @Column
    private int int412;
    @Column
    private int int413;
    @Column
    private int int414;
    @Column
    private int int415;
    @Column
    private int int416;
    @Column
    private int int417;
    @Column
    private int int418;
    @Column
    private int int419;
    @Column
    private int int420;
    @Column
    private int int421;
    @Column
    private int int422;
    @Column
    private int int423;
    @Column
    private int int424;
    @Column
    private int int425;
    @Column
    private int int426;
    @Column
    private int int427;
    @Column
    private int int428;
    @Column
    private int int429;
    @Column
    private int int430;
    @Column
    private int int431;
    @Column
    private int int432;
    @Column
    private int int433;
    @Column
    private int int434;
    @Column
    private int int435;
    @Column
    private int int436;
    @Column
    private int int437;
    @Column
    private int int438;
    @Column
    private int int439;
    @Column
    private int int440;
    @Column
    private int int441;
    @Column
    private int int442;
    @Column
    private int int443;
    @Column
    private int int444;
    @Column
    private int int445;
    @Column
    private int int446;
    @Column
    private int int447;
    @Column
    private int int448;
    @Column
    private int int449;
    @Column
    private int int450;
    @Column
    private int int451;
    @Column
    private int int452;
    @Column
    private int int453;
    @Column
    private int int454;
    @Column
    private int int455;
    @Column
    private int int456;
    @Column
    private int int457;
    @Column
    private int int458;
    @Column
    private int int459;
    @Column
    private int int460;
    @Column
    private int int461;
    @Column
    private int int462;
    @Column
    private int int463;
    @Column
    private int int464;
    @Column
    private int int465;
    @Column
    private int int466;
    @Column
    private int int467;
    @Column
    private int int468;
    @Column
    private int int469;
    @Column
    private int int470;
    @Column
    private int int471;
    @Column
    private int int472;
    @Column
    private int int473;
    @Column
    private int int474;
    @Column
    private int int475;
    @Column
    private int int476;
    @Column
    private int int477;
    @Column
    private int int478;
    @Column
    private int int479;
    @Column
    private int int480;
    @Column
    private int int481;
    @Column
    private int int482;
    @Column
    private int int483;
    @Column
    private int int484;
    @Column
    private int int485;
    @Column
    private int int486;
    @Column
    private int int487;
    @Column
    private int int488;
    @Column
    private int int489;
    @Column
    private int int490;
    @Column
    private int int491;
    @Column
    private int int492;
    @Column
    private int int493;
    @Column
    private int int494;
    @Column
    private int int495;
    @Column
    private int int496;
    @Column
    private int int497;
    @Column
    private int int498;
    @Column
    private int int499;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    public String getStr4() {
        return str4;
    }

    public void setStr4(String str4) {
        this.str4 = str4;
    }

    public String getStr5() {
        return str5;
    }

    public void setStr5(String str5) {
        this.str5 = str5;
    }

    public String getStr6() {
        return str6;
    }

    public void setStr6(String str6) {
        this.str6 = str6;
    }

    public String getStr7() {
        return str7;
    }

    public void setStr7(String str7) {
        this.str7 = str7;
    }

    public String getStr8() {
        return str8;
    }

    public void setStr8(String str8) {
        this.str8 = str8;
    }

    public String getStr9() {
        return str9;
    }

    public void setStr9(String str9) {
        this.str9 = str9;
    }

    public String getStr10() {
        return str10;
    }

    public void setStr10(String str10) {
        this.str10 = str10;
    }

    public String getStr11() {
        return str11;
    }

    public void setStr11(String str11) {
        this.str11 = str11;
    }

    public String getStr12() {
        return str12;
    }

    public void setStr12(String str12) {
        this.str12 = str12;
    }

    public String getStr13() {
        return str13;
    }

    public void setStr13(String str13) {
        this.str13 = str13;
    }

    public String getStr14() {
        return str14;
    }

    public void setStr14(String str14) {
        this.str14 = str14;
    }

    public String getStr15() {
        return str15;
    }

    public void setStr15(String str15) {
        this.str15 = str15;
    }

    public String getStr16() {
        return str16;
    }

    public void setStr16(String str16) {
        this.str16 = str16;
    }

    public String getStr17() {
        return str17;
    }

    public void setStr17(String str17) {
        this.str17 = str17;
    }

    public String getStr18() {
        return str18;
    }

    public void setStr18(String str18) {
        this.str18 = str18;
    }

    public String getStr19() {
        return str19;
    }

    public void setStr19(String str19) {
        this.str19 = str19;
    }

    public String getStr20() {
        return str20;
    }

    public void setStr20(String str20) {
        this.str20 = str20;
    }

    public String getStr21() {
        return str21;
    }

    public void setStr21(String str21) {
        this.str21 = str21;
    }

    public String getStr22() {
        return str22;
    }

    public void setStr22(String str22) {
        this.str22 = str22;
    }

    public String getStr23() {
        return str23;
    }

    public void setStr23(String str23) {
        this.str23 = str23;
    }

    public String getStr24() {
        return str24;
    }

    public void setStr24(String str24) {
        this.str24 = str24;
    }

    public String getStr25() {
        return str25;
    }

    public void setStr25(String str25) {
        this.str25 = str25;
    }

    public String getStr26() {
        return str26;
    }

    public void setStr26(String str26) {
        this.str26 = str26;
    }

    public String getStr27() {
        return str27;
    }

    public void setStr27(String str27) {
        this.str27 = str27;
    }

    public String getStr28() {
        return str28;
    }

    public void setStr28(String str28) {
        this.str28 = str28;
    }

    public String getStr29() {
        return str29;
    }

    public void setStr29(String str29) {
        this.str29 = str29;
    }

    public String getStr30() {
        return str30;
    }

    public void setStr30(String str30) {
        this.str30 = str30;
    }

    public String getStr31() {
        return str31;
    }

    public void setStr31(String str31) {
        this.str31 = str31;
    }

    public String getStr32() {
        return str32;
    }

    public void setStr32(String str32) {
        this.str32 = str32;
    }

    public String getStr33() {
        return str33;
    }

    public void setStr33(String str33) {
        this.str33 = str33;
    }

    public String getStr34() {
        return str34;
    }

    public void setStr34(String str34) {
        this.str34 = str34;
    }

    public String getStr35() {
        return str35;
    }

    public void setStr35(String str35) {
        this.str35 = str35;
    }

    public String getStr36() {
        return str36;
    }

    public void setStr36(String str36) {
        this.str36 = str36;
    }

    public String getStr37() {
        return str37;
    }

    public void setStr37(String str37) {
        this.str37 = str37;
    }

    public String getStr38() {
        return str38;
    }

    public void setStr38(String str38) {
        this.str38 = str38;
    }

    public String getStr39() {
        return str39;
    }

    public void setStr39(String str39) {
        this.str39 = str39;
    }

    public String getStr40() {
        return str40;
    }

    public void setStr40(String str40) {
        this.str40 = str40;
    }

    public String getStr41() {
        return str41;
    }

    public void setStr41(String str41) {
        this.str41 = str41;
    }

    public String getStr42() {
        return str42;
    }

    public void setStr42(String str42) {
        this.str42 = str42;
    }

    public String getStr43() {
        return str43;
    }

    public void setStr43(String str43) {
        this.str43 = str43;
    }

    public String getStr44() {
        return str44;
    }

    public void setStr44(String str44) {
        this.str44 = str44;
    }

    public String getStr45() {
        return str45;
    }

    public void setStr45(String str45) {
        this.str45 = str45;
    }

    public String getStr46() {
        return str46;
    }

    public void setStr46(String str46) {
        this.str46 = str46;
    }

    public String getStr47() {
        return str47;
    }

    public void setStr47(String str47) {
        this.str47 = str47;
    }

    public String getStr48() {
        return str48;
    }

    public void setStr48(String str48) {
        this.str48 = str48;
    }

    public String getStr49() {
        return str49;
    }

    public void setStr49(String str49) {
        this.str49 = str49;
    }

    public String getStr50() {
        return str50;
    }

    public void setStr50(String str50) {
        this.str50 = str50;
    }

    public String getStr51() {
        return str51;
    }

    public void setStr51(String str51) {
        this.str51 = str51;
    }

    public String getStr52() {
        return str52;
    }

    public void setStr52(String str52) {
        this.str52 = str52;
    }

    public String getStr53() {
        return str53;
    }

    public void setStr53(String str53) {
        this.str53 = str53;
    }

    public String getStr54() {
        return str54;
    }

    public void setStr54(String str54) {
        this.str54 = str54;
    }

    public String getStr55() {
        return str55;
    }

    public void setStr55(String str55) {
        this.str55 = str55;
    }

    public String getStr56() {
        return str56;
    }

    public void setStr56(String str56) {
        this.str56 = str56;
    }

    public String getStr57() {
        return str57;
    }

    public void setStr57(String str57) {
        this.str57 = str57;
    }

    public String getStr58() {
        return str58;
    }

    public void setStr58(String str58) {
        this.str58 = str58;
    }

    public String getStr59() {
        return str59;
    }

    public void setStr59(String str59) {
        this.str59 = str59;
    }

    public String getStr60() {
        return str60;
    }

    public void setStr60(String str60) {
        this.str60 = str60;
    }

    public String getStr61() {
        return str61;
    }

    public void setStr61(String str61) {
        this.str61 = str61;
    }

    public String getStr62() {
        return str62;
    }

    public void setStr62(String str62) {
        this.str62 = str62;
    }

    public String getStr63() {
        return str63;
    }

    public void setStr63(String str63) {
        this.str63 = str63;
    }

    public String getStr64() {
        return str64;
    }

    public void setStr64(String str64) {
        this.str64 = str64;
    }

    public String getStr65() {
        return str65;
    }

    public void setStr65(String str65) {
        this.str65 = str65;
    }

    public String getStr66() {
        return str66;
    }

    public void setStr66(String str66) {
        this.str66 = str66;
    }

    public String getStr67() {
        return str67;
    }

    public void setStr67(String str67) {
        this.str67 = str67;
    }

    public String getStr68() {
        return str68;
    }

    public void setStr68(String str68) {
        this.str68 = str68;
    }

    public String getStr69() {
        return str69;
    }

    public void setStr69(String str69) {
        this.str69 = str69;
    }

    public String getStr70() {
        return str70;
    }

    public void setStr70(String str70) {
        this.str70 = str70;
    }

    public String getStr71() {
        return str71;
    }

    public void setStr71(String str71) {
        this.str71 = str71;
    }

    public String getStr72() {
        return str72;
    }

    public void setStr72(String str72) {
        this.str72 = str72;
    }

    public String getStr73() {
        return str73;
    }

    public void setStr73(String str73) {
        this.str73 = str73;
    }

    public String getStr74() {
        return str74;
    }

    public void setStr74(String str74) {
        this.str74 = str74;
    }

    public String getStr75() {
        return str75;
    }

    public void setStr75(String str75) {
        this.str75 = str75;
    }

    public String getStr76() {
        return str76;
    }

    public void setStr76(String str76) {
        this.str76 = str76;
    }

    public String getStr77() {
        return str77;
    }

    public void setStr77(String str77) {
        this.str77 = str77;
    }

    public String getStr78() {
        return str78;
    }

    public void setStr78(String str78) {
        this.str78 = str78;
    }

    public String getStr79() {
        return str79;
    }

    public void setStr79(String str79) {
        this.str79 = str79;
    }

    public String getStr80() {
        return str80;
    }

    public void setStr80(String str80) {
        this.str80 = str80;
    }

    public String getStr81() {
        return str81;
    }

    public void setStr81(String str81) {
        this.str81 = str81;
    }

    public String getStr82() {
        return str82;
    }

    public void setStr82(String str82) {
        this.str82 = str82;
    }

    public String getStr83() {
        return str83;
    }

    public void setStr83(String str83) {
        this.str83 = str83;
    }

    public String getStr84() {
        return str84;
    }

    public void setStr84(String str84) {
        this.str84 = str84;
    }

    public String getStr85() {
        return str85;
    }

    public void setStr85(String str85) {
        this.str85 = str85;
    }

    public String getStr86() {
        return str86;
    }

    public void setStr86(String str86) {
        this.str86 = str86;
    }

    public String getStr87() {
        return str87;
    }

    public void setStr87(String str87) {
        this.str87 = str87;
    }

    public String getStr88() {
        return str88;
    }

    public void setStr88(String str88) {
        this.str88 = str88;
    }

    public String getStr89() {
        return str89;
    }

    public void setStr89(String str89) {
        this.str89 = str89;
    }

    public String getStr90() {
        return str90;
    }

    public void setStr90(String str90) {
        this.str90 = str90;
    }

    public String getStr91() {
        return str91;
    }

    public void setStr91(String str91) {
        this.str91 = str91;
    }

    public String getStr92() {
        return str92;
    }

    public void setStr92(String str92) {
        this.str92 = str92;
    }

    public String getStr93() {
        return str93;
    }

    public void setStr93(String str93) {
        this.str93 = str93;
    }

    public String getStr94() {
        return str94;
    }

    public void setStr94(String str94) {
        this.str94 = str94;
    }

    public String getStr95() {
        return str95;
    }

    public void setStr95(String str95) {
        this.str95 = str95;
    }

    public String getStr96() {
        return str96;
    }

    public void setStr96(String str96) {
        this.str96 = str96;
    }

    public String getStr97() {
        return str97;
    }

    public void setStr97(String str97) {
        this.str97 = str97;
    }

    public String getStr98() {
        return str98;
    }

    public void setStr98(String str98) {
        this.str98 = str98;
    }

    public String getStr99() {
        return str99;
    }

    public void setStr99(String str99) {
        this.str99 = str99;
    }

    public String getStr100() {
        return str100;
    }

    public void setStr100(String str100) {
        this.str100 = str100;
    }

    public String getStr101() {
        return str101;
    }

    public void setStr101(String str101) {
        this.str101 = str101;
    }

    public String getStr102() {
        return str102;
    }

    public void setStr102(String str102) {
        this.str102 = str102;
    }

    public String getStr103() {
        return str103;
    }

    public void setStr103(String str103) {
        this.str103 = str103;
    }

    public String getStr104() {
        return str104;
    }

    public void setStr104(String str104) {
        this.str104 = str104;
    }

    public String getStr105() {
        return str105;
    }

    public void setStr105(String str105) {
        this.str105 = str105;
    }

    public String getStr106() {
        return str106;
    }

    public void setStr106(String str106) {
        this.str106 = str106;
    }

    public String getStr107() {
        return str107;
    }

    public void setStr107(String str107) {
        this.str107 = str107;
    }

    public String getStr108() {
        return str108;
    }

    public void setStr108(String str108) {
        this.str108 = str108;
    }

    public String getStr109() {
        return str109;
    }

    public void setStr109(String str109) {
        this.str109 = str109;
    }

    public String getStr110() {
        return str110;
    }

    public void setStr110(String str110) {
        this.str110 = str110;
    }

    public String getStr111() {
        return str111;
    }

    public void setStr111(String str111) {
        this.str111 = str111;
    }

    public String getStr112() {
        return str112;
    }

    public void setStr112(String str112) {
        this.str112 = str112;
    }

    public String getStr113() {
        return str113;
    }

    public void setStr113(String str113) {
        this.str113 = str113;
    }

    public String getStr114() {
        return str114;
    }

    public void setStr114(String str114) {
        this.str114 = str114;
    }

    public String getStr115() {
        return str115;
    }

    public void setStr115(String str115) {
        this.str115 = str115;
    }

    public String getStr116() {
        return str116;
    }

    public void setStr116(String str116) {
        this.str116 = str116;
    }

    public String getStr117() {
        return str117;
    }

    public void setStr117(String str117) {
        this.str117 = str117;
    }

    public String getStr118() {
        return str118;
    }

    public void setStr118(String str118) {
        this.str118 = str118;
    }

    public String getStr119() {
        return str119;
    }

    public void setStr119(String str119) {
        this.str119 = str119;
    }

    public String getStr120() {
        return str120;
    }

    public void setStr120(String str120) {
        this.str120 = str120;
    }

    public String getStr121() {
        return str121;
    }

    public void setStr121(String str121) {
        this.str121 = str121;
    }

    public String getStr122() {
        return str122;
    }

    public void setStr122(String str122) {
        this.str122 = str122;
    }

    public String getStr123() {
        return str123;
    }

    public void setStr123(String str123) {
        this.str123 = str123;
    }

    public String getStr124() {
        return str124;
    }

    public void setStr124(String str124) {
        this.str124 = str124;
    }

    public String getStr125() {
        return str125;
    }

    public void setStr125(String str125) {
        this.str125 = str125;
    }

    public String getStr126() {
        return str126;
    }

    public void setStr126(String str126) {
        this.str126 = str126;
    }

    public String getStr127() {
        return str127;
    }

    public void setStr127(String str127) {
        this.str127 = str127;
    }

    public String getStr128() {
        return str128;
    }

    public void setStr128(String str128) {
        this.str128 = str128;
    }

    public String getStr129() {
        return str129;
    }

    public void setStr129(String str129) {
        this.str129 = str129;
    }

    public String getStr130() {
        return str130;
    }

    public void setStr130(String str130) {
        this.str130 = str130;
    }

    public String getStr131() {
        return str131;
    }

    public void setStr131(String str131) {
        this.str131 = str131;
    }

    public String getStr132() {
        return str132;
    }

    public void setStr132(String str132) {
        this.str132 = str132;
    }

    public String getStr133() {
        return str133;
    }

    public void setStr133(String str133) {
        this.str133 = str133;
    }

    public String getStr134() {
        return str134;
    }

    public void setStr134(String str134) {
        this.str134 = str134;
    }

    public String getStr135() {
        return str135;
    }

    public void setStr135(String str135) {
        this.str135 = str135;
    }

    public String getStr136() {
        return str136;
    }

    public void setStr136(String str136) {
        this.str136 = str136;
    }

    public String getStr137() {
        return str137;
    }

    public void setStr137(String str137) {
        this.str137 = str137;
    }

    public String getStr138() {
        return str138;
    }

    public void setStr138(String str138) {
        this.str138 = str138;
    }

    public String getStr139() {
        return str139;
    }

    public void setStr139(String str139) {
        this.str139 = str139;
    }

    public String getStr140() {
        return str140;
    }

    public void setStr140(String str140) {
        this.str140 = str140;
    }

    public String getStr141() {
        return str141;
    }

    public void setStr141(String str141) {
        this.str141 = str141;
    }

    public String getStr142() {
        return str142;
    }

    public void setStr142(String str142) {
        this.str142 = str142;
    }

    public String getStr143() {
        return str143;
    }

    public void setStr143(String str143) {
        this.str143 = str143;
    }

    public String getStr144() {
        return str144;
    }

    public void setStr144(String str144) {
        this.str144 = str144;
    }

    public String getStr145() {
        return str145;
    }

    public void setStr145(String str145) {
        this.str145 = str145;
    }

    public String getStr146() {
        return str146;
    }

    public void setStr146(String str146) {
        this.str146 = str146;
    }

    public String getStr147() {
        return str147;
    }

    public void setStr147(String str147) {
        this.str147 = str147;
    }

    public String getStr148() {
        return str148;
    }

    public void setStr148(String str148) {
        this.str148 = str148;
    }

    public String getStr149() {
        return str149;
    }

    public void setStr149(String str149) {
        this.str149 = str149;
    }

    public String getStr150() {
        return str150;
    }

    public void setStr150(String str150) {
        this.str150 = str150;
    }

    public String getStr151() {
        return str151;
    }

    public void setStr151(String str151) {
        this.str151 = str151;
    }

    public String getStr152() {
        return str152;
    }

    public void setStr152(String str152) {
        this.str152 = str152;
    }

    public String getStr153() {
        return str153;
    }

    public void setStr153(String str153) {
        this.str153 = str153;
    }

    public String getStr154() {
        return str154;
    }

    public void setStr154(String str154) {
        this.str154 = str154;
    }

    public String getStr155() {
        return str155;
    }

    public void setStr155(String str155) {
        this.str155 = str155;
    }

    public String getStr156() {
        return str156;
    }

    public void setStr156(String str156) {
        this.str156 = str156;
    }

    public String getStr157() {
        return str157;
    }

    public void setStr157(String str157) {
        this.str157 = str157;
    }

    public String getStr158() {
        return str158;
    }

    public void setStr158(String str158) {
        this.str158 = str158;
    }

    public String getStr159() {
        return str159;
    }

    public void setStr159(String str159) {
        this.str159 = str159;
    }

    public String getStr160() {
        return str160;
    }

    public void setStr160(String str160) {
        this.str160 = str160;
    }

    public String getStr161() {
        return str161;
    }

    public void setStr161(String str161) {
        this.str161 = str161;
    }

    public String getStr162() {
        return str162;
    }

    public void setStr162(String str162) {
        this.str162 = str162;
    }

    public String getStr163() {
        return str163;
    }

    public void setStr163(String str163) {
        this.str163 = str163;
    }

    public String getStr164() {
        return str164;
    }

    public void setStr164(String str164) {
        this.str164 = str164;
    }

    public String getStr165() {
        return str165;
    }

    public void setStr165(String str165) {
        this.str165 = str165;
    }

    public String getStr166() {
        return str166;
    }

    public void setStr166(String str166) {
        this.str166 = str166;
    }

    public String getStr167() {
        return str167;
    }

    public void setStr167(String str167) {
        this.str167 = str167;
    }

    public String getStr168() {
        return str168;
    }

    public void setStr168(String str168) {
        this.str168 = str168;
    }

    public String getStr169() {
        return str169;
    }

    public void setStr169(String str169) {
        this.str169 = str169;
    }

    public String getStr170() {
        return str170;
    }

    public void setStr170(String str170) {
        this.str170 = str170;
    }

    public String getStr171() {
        return str171;
    }

    public void setStr171(String str171) {
        this.str171 = str171;
    }

    public String getStr172() {
        return str172;
    }

    public void setStr172(String str172) {
        this.str172 = str172;
    }

    public String getStr173() {
        return str173;
    }

    public void setStr173(String str173) {
        this.str173 = str173;
    }

    public String getStr174() {
        return str174;
    }

    public void setStr174(String str174) {
        this.str174 = str174;
    }

    public String getStr175() {
        return str175;
    }

    public void setStr175(String str175) {
        this.str175 = str175;
    }

    public String getStr176() {
        return str176;
    }

    public void setStr176(String str176) {
        this.str176 = str176;
    }

    public String getStr177() {
        return str177;
    }

    public void setStr177(String str177) {
        this.str177 = str177;
    }

    public String getStr178() {
        return str178;
    }

    public void setStr178(String str178) {
        this.str178 = str178;
    }

    public String getStr179() {
        return str179;
    }

    public void setStr179(String str179) {
        this.str179 = str179;
    }

    public String getStr180() {
        return str180;
    }

    public void setStr180(String str180) {
        this.str180 = str180;
    }

    public String getStr181() {
        return str181;
    }

    public void setStr181(String str181) {
        this.str181 = str181;
    }

    public String getStr182() {
        return str182;
    }

    public void setStr182(String str182) {
        this.str182 = str182;
    }

    public String getStr183() {
        return str183;
    }

    public void setStr183(String str183) {
        this.str183 = str183;
    }

    public String getStr184() {
        return str184;
    }

    public void setStr184(String str184) {
        this.str184 = str184;
    }

    public String getStr185() {
        return str185;
    }

    public void setStr185(String str185) {
        this.str185 = str185;
    }

    public String getStr186() {
        return str186;
    }

    public void setStr186(String str186) {
        this.str186 = str186;
    }

    public String getStr187() {
        return str187;
    }

    public void setStr187(String str187) {
        this.str187 = str187;
    }

    public String getStr188() {
        return str188;
    }

    public void setStr188(String str188) {
        this.str188 = str188;
    }

    public String getStr189() {
        return str189;
    }

    public void setStr189(String str189) {
        this.str189 = str189;
    }

    public String getStr190() {
        return str190;
    }

    public void setStr190(String str190) {
        this.str190 = str190;
    }

    public String getStr191() {
        return str191;
    }

    public void setStr191(String str191) {
        this.str191 = str191;
    }

    public String getStr192() {
        return str192;
    }

    public void setStr192(String str192) {
        this.str192 = str192;
    }

    public String getStr193() {
        return str193;
    }

    public void setStr193(String str193) {
        this.str193 = str193;
    }

    public String getStr194() {
        return str194;
    }

    public void setStr194(String str194) {
        this.str194 = str194;
    }

    public String getStr195() {
        return str195;
    }

    public void setStr195(String str195) {
        this.str195 = str195;
    }

    public String getStr196() {
        return str196;
    }

    public void setStr196(String str196) {
        this.str196 = str196;
    }

    public String getStr197() {
        return str197;
    }

    public void setStr197(String str197) {
        this.str197 = str197;
    }

    public String getStr198() {
        return str198;
    }

    public void setStr198(String str198) {
        this.str198 = str198;
    }

    public String getStr199() {
        return str199;
    }

    public void setStr199(String str199) {
        this.str199 = str199;
    }

    public String getStr200() {
        return str200;
    }

    public void setStr200(String str200) {
        this.str200 = str200;
    }

    public String getStr201() {
        return str201;
    }

    public void setStr201(String str201) {
        this.str201 = str201;
    }

    public String getStr202() {
        return str202;
    }

    public void setStr202(String str202) {
        this.str202 = str202;
    }

    public String getStr203() {
        return str203;
    }

    public void setStr203(String str203) {
        this.str203 = str203;
    }

    public String getStr204() {
        return str204;
    }

    public void setStr204(String str204) {
        this.str204 = str204;
    }

    public String getStr205() {
        return str205;
    }

    public void setStr205(String str205) {
        this.str205 = str205;
    }

    public String getStr206() {
        return str206;
    }

    public void setStr206(String str206) {
        this.str206 = str206;
    }

    public String getStr207() {
        return str207;
    }

    public void setStr207(String str207) {
        this.str207 = str207;
    }

    public String getStr208() {
        return str208;
    }

    public void setStr208(String str208) {
        this.str208 = str208;
    }

    public String getStr209() {
        return str209;
    }

    public void setStr209(String str209) {
        this.str209 = str209;
    }

    public String getStr210() {
        return str210;
    }

    public void setStr210(String str210) {
        this.str210 = str210;
    }

    public String getStr211() {
        return str211;
    }

    public void setStr211(String str211) {
        this.str211 = str211;
    }

    public String getStr212() {
        return str212;
    }

    public void setStr212(String str212) {
        this.str212 = str212;
    }

    public String getStr213() {
        return str213;
    }

    public void setStr213(String str213) {
        this.str213 = str213;
    }

    public String getStr214() {
        return str214;
    }

    public void setStr214(String str214) {
        this.str214 = str214;
    }

    public String getStr215() {
        return str215;
    }

    public void setStr215(String str215) {
        this.str215 = str215;
    }

    public String getStr216() {
        return str216;
    }

    public void setStr216(String str216) {
        this.str216 = str216;
    }

    public String getStr217() {
        return str217;
    }

    public void setStr217(String str217) {
        this.str217 = str217;
    }

    public String getStr218() {
        return str218;
    }

    public void setStr218(String str218) {
        this.str218 = str218;
    }

    public String getStr219() {
        return str219;
    }

    public void setStr219(String str219) {
        this.str219 = str219;
    }

    public String getStr220() {
        return str220;
    }

    public void setStr220(String str220) {
        this.str220 = str220;
    }

    public String getStr221() {
        return str221;
    }

    public void setStr221(String str221) {
        this.str221 = str221;
    }

    public String getStr222() {
        return str222;
    }

    public void setStr222(String str222) {
        this.str222 = str222;
    }

    public String getStr223() {
        return str223;
    }

    public void setStr223(String str223) {
        this.str223 = str223;
    }

    public String getStr224() {
        return str224;
    }

    public void setStr224(String str224) {
        this.str224 = str224;
    }

    public String getStr225() {
        return str225;
    }

    public void setStr225(String str225) {
        this.str225 = str225;
    }

    public String getStr226() {
        return str226;
    }

    public void setStr226(String str226) {
        this.str226 = str226;
    }

    public String getStr227() {
        return str227;
    }

    public void setStr227(String str227) {
        this.str227 = str227;
    }

    public String getStr228() {
        return str228;
    }

    public void setStr228(String str228) {
        this.str228 = str228;
    }

    public String getStr229() {
        return str229;
    }

    public void setStr229(String str229) {
        this.str229 = str229;
    }

    public String getStr230() {
        return str230;
    }

    public void setStr230(String str230) {
        this.str230 = str230;
    }

    public String getStr231() {
        return str231;
    }

    public void setStr231(String str231) {
        this.str231 = str231;
    }

    public String getStr232() {
        return str232;
    }

    public void setStr232(String str232) {
        this.str232 = str232;
    }

    public String getStr233() {
        return str233;
    }

    public void setStr233(String str233) {
        this.str233 = str233;
    }

    public String getStr234() {
        return str234;
    }

    public void setStr234(String str234) {
        this.str234 = str234;
    }

    public String getStr235() {
        return str235;
    }

    public void setStr235(String str235) {
        this.str235 = str235;
    }

    public String getStr236() {
        return str236;
    }

    public void setStr236(String str236) {
        this.str236 = str236;
    }

    public String getStr237() {
        return str237;
    }

    public void setStr237(String str237) {
        this.str237 = str237;
    }

    public String getStr238() {
        return str238;
    }

    public void setStr238(String str238) {
        this.str238 = str238;
    }

    public String getStr239() {
        return str239;
    }

    public void setStr239(String str239) {
        this.str239 = str239;
    }

    public String getStr240() {
        return str240;
    }

    public void setStr240(String str240) {
        this.str240 = str240;
    }

    public String getStr241() {
        return str241;
    }

    public void setStr241(String str241) {
        this.str241 = str241;
    }

    public String getStr242() {
        return str242;
    }

    public void setStr242(String str242) {
        this.str242 = str242;
    }

    public String getStr243() {
        return str243;
    }

    public void setStr243(String str243) {
        this.str243 = str243;
    }

    public String getStr244() {
        return str244;
    }

    public void setStr244(String str244) {
        this.str244 = str244;
    }

    public String getStr245() {
        return str245;
    }

    public void setStr245(String str245) {
        this.str245 = str245;
    }

    public String getStr246() {
        return str246;
    }

    public void setStr246(String str246) {
        this.str246 = str246;
    }

    public String getStr247() {
        return str247;
    }

    public void setStr247(String str247) {
        this.str247 = str247;
    }

    public String getStr248() {
        return str248;
    }

    public void setStr248(String str248) {
        this.str248 = str248;
    }

    public String getStr249() {
        return str249;
    }

    public void setStr249(String str249) {
        this.str249 = str249;
    }

    public String getStr250() {
        return str250;
    }

    public void setStr250(String str250) {
        this.str250 = str250;
    }

    public String getStr251() {
        return str251;
    }

    public void setStr251(String str251) {
        this.str251 = str251;
    }

    public String getStr252() {
        return str252;
    }

    public void setStr252(String str252) {
        this.str252 = str252;
    }

    public String getStr253() {
        return str253;
    }

    public void setStr253(String str253) {
        this.str253 = str253;
    }

    public String getStr254() {
        return str254;
    }

    public void setStr254(String str254) {
        this.str254 = str254;
    }

    public String getStr255() {
        return str255;
    }

    public void setStr255(String str255) {
        this.str255 = str255;
    }

    public String getStr256() {
        return str256;
    }

    public void setStr256(String str256) {
        this.str256 = str256;
    }

    public String getStr257() {
        return str257;
    }

    public void setStr257(String str257) {
        this.str257 = str257;
    }

    public String getStr258() {
        return str258;
    }

    public void setStr258(String str258) {
        this.str258 = str258;
    }

    public String getStr259() {
        return str259;
    }

    public void setStr259(String str259) {
        this.str259 = str259;
    }

    public String getStr260() {
        return str260;
    }

    public void setStr260(String str260) {
        this.str260 = str260;
    }

    public String getStr261() {
        return str261;
    }

    public void setStr261(String str261) {
        this.str261 = str261;
    }

    public String getStr262() {
        return str262;
    }

    public void setStr262(String str262) {
        this.str262 = str262;
    }

    public String getStr263() {
        return str263;
    }

    public void setStr263(String str263) {
        this.str263 = str263;
    }

    public String getStr264() {
        return str264;
    }

    public void setStr264(String str264) {
        this.str264 = str264;
    }

    public String getStr265() {
        return str265;
    }

    public void setStr265(String str265) {
        this.str265 = str265;
    }

    public String getStr266() {
        return str266;
    }

    public void setStr266(String str266) {
        this.str266 = str266;
    }

    public String getStr267() {
        return str267;
    }

    public void setStr267(String str267) {
        this.str267 = str267;
    }

    public String getStr268() {
        return str268;
    }

    public void setStr268(String str268) {
        this.str268 = str268;
    }

    public String getStr269() {
        return str269;
    }

    public void setStr269(String str269) {
        this.str269 = str269;
    }

    public String getStr270() {
        return str270;
    }

    public void setStr270(String str270) {
        this.str270 = str270;
    }

    public String getStr271() {
        return str271;
    }

    public void setStr271(String str271) {
        this.str271 = str271;
    }

    public String getStr272() {
        return str272;
    }

    public void setStr272(String str272) {
        this.str272 = str272;
    }

    public String getStr273() {
        return str273;
    }

    public void setStr273(String str273) {
        this.str273 = str273;
    }

    public String getStr274() {
        return str274;
    }

    public void setStr274(String str274) {
        this.str274 = str274;
    }

    public String getStr275() {
        return str275;
    }

    public void setStr275(String str275) {
        this.str275 = str275;
    }

    public String getStr276() {
        return str276;
    }

    public void setStr276(String str276) {
        this.str276 = str276;
    }

    public String getStr277() {
        return str277;
    }

    public void setStr277(String str277) {
        this.str277 = str277;
    }

    public String getStr278() {
        return str278;
    }

    public void setStr278(String str278) {
        this.str278 = str278;
    }

    public String getStr279() {
        return str279;
    }

    public void setStr279(String str279) {
        this.str279 = str279;
    }

    public String getStr280() {
        return str280;
    }

    public void setStr280(String str280) {
        this.str280 = str280;
    }

    public String getStr281() {
        return str281;
    }

    public void setStr281(String str281) {
        this.str281 = str281;
    }

    public String getStr282() {
        return str282;
    }

    public void setStr282(String str282) {
        this.str282 = str282;
    }

    public String getStr283() {
        return str283;
    }

    public void setStr283(String str283) {
        this.str283 = str283;
    }

    public String getStr284() {
        return str284;
    }

    public void setStr284(String str284) {
        this.str284 = str284;
    }

    public String getStr285() {
        return str285;
    }

    public void setStr285(String str285) {
        this.str285 = str285;
    }

    public String getStr286() {
        return str286;
    }

    public void setStr286(String str286) {
        this.str286 = str286;
    }

    public String getStr287() {
        return str287;
    }

    public void setStr287(String str287) {
        this.str287 = str287;
    }

    public String getStr288() {
        return str288;
    }

    public void setStr288(String str288) {
        this.str288 = str288;
    }

    public String getStr289() {
        return str289;
    }

    public void setStr289(String str289) {
        this.str289 = str289;
    }

    public String getStr290() {
        return str290;
    }

    public void setStr290(String str290) {
        this.str290 = str290;
    }

    public String getStr291() {
        return str291;
    }

    public void setStr291(String str291) {
        this.str291 = str291;
    }

    public String getStr292() {
        return str292;
    }

    public void setStr292(String str292) {
        this.str292 = str292;
    }

    public String getStr293() {
        return str293;
    }

    public void setStr293(String str293) {
        this.str293 = str293;
    }

    public String getStr294() {
        return str294;
    }

    public void setStr294(String str294) {
        this.str294 = str294;
    }

    public String getStr295() {
        return str295;
    }

    public void setStr295(String str295) {
        this.str295 = str295;
    }

    public String getStr296() {
        return str296;
    }

    public void setStr296(String str296) {
        this.str296 = str296;
    }

    public String getStr297() {
        return str297;
    }

    public void setStr297(String str297) {
        this.str297 = str297;
    }

    public String getStr298() {
        return str298;
    }

    public void setStr298(String str298) {
        this.str298 = str298;
    }

    public String getStr299() {
        return str299;
    }

    public void setStr299(String str299) {
        this.str299 = str299;
    }

    public String getStr300() {
        return str300;
    }

    public void setStr300(String str300) {
        this.str300 = str300;
    }

    public String getStr301() {
        return str301;
    }

    public void setStr301(String str301) {
        this.str301 = str301;
    }

    public String getStr302() {
        return str302;
    }

    public void setStr302(String str302) {
        this.str302 = str302;
    }

    public String getStr303() {
        return str303;
    }

    public void setStr303(String str303) {
        this.str303 = str303;
    }

    public String getStr304() {
        return str304;
    }

    public void setStr304(String str304) {
        this.str304 = str304;
    }

    public String getStr305() {
        return str305;
    }

    public void setStr305(String str305) {
        this.str305 = str305;
    }

    public String getStr306() {
        return str306;
    }

    public void setStr306(String str306) {
        this.str306 = str306;
    }

    public String getStr307() {
        return str307;
    }

    public void setStr307(String str307) {
        this.str307 = str307;
    }

    public String getStr308() {
        return str308;
    }

    public void setStr308(String str308) {
        this.str308 = str308;
    }

    public String getStr309() {
        return str309;
    }

    public void setStr309(String str309) {
        this.str309 = str309;
    }

    public String getStr310() {
        return str310;
    }

    public void setStr310(String str310) {
        this.str310 = str310;
    }

    public String getStr311() {
        return str311;
    }

    public void setStr311(String str311) {
        this.str311 = str311;
    }

    public String getStr312() {
        return str312;
    }

    public void setStr312(String str312) {
        this.str312 = str312;
    }

    public String getStr313() {
        return str313;
    }

    public void setStr313(String str313) {
        this.str313 = str313;
    }

    public String getStr314() {
        return str314;
    }

    public void setStr314(String str314) {
        this.str314 = str314;
    }

    public String getStr315() {
        return str315;
    }

    public void setStr315(String str315) {
        this.str315 = str315;
    }

    public String getStr316() {
        return str316;
    }

    public void setStr316(String str316) {
        this.str316 = str316;
    }

    public String getStr317() {
        return str317;
    }

    public void setStr317(String str317) {
        this.str317 = str317;
    }

    public String getStr318() {
        return str318;
    }

    public void setStr318(String str318) {
        this.str318 = str318;
    }

    public String getStr319() {
        return str319;
    }

    public void setStr319(String str319) {
        this.str319 = str319;
    }

    public String getStr320() {
        return str320;
    }

    public void setStr320(String str320) {
        this.str320 = str320;
    }

    public String getStr321() {
        return str321;
    }

    public void setStr321(String str321) {
        this.str321 = str321;
    }

    public String getStr322() {
        return str322;
    }

    public void setStr322(String str322) {
        this.str322 = str322;
    }

    public String getStr323() {
        return str323;
    }

    public void setStr323(String str323) {
        this.str323 = str323;
    }

    public String getStr324() {
        return str324;
    }

    public void setStr324(String str324) {
        this.str324 = str324;
    }

    public String getStr325() {
        return str325;
    }

    public void setStr325(String str325) {
        this.str325 = str325;
    }

    public String getStr326() {
        return str326;
    }

    public void setStr326(String str326) {
        this.str326 = str326;
    }

    public String getStr327() {
        return str327;
    }

    public void setStr327(String str327) {
        this.str327 = str327;
    }

    public String getStr328() {
        return str328;
    }

    public void setStr328(String str328) {
        this.str328 = str328;
    }

    public String getStr329() {
        return str329;
    }

    public void setStr329(String str329) {
        this.str329 = str329;
    }

    public String getStr330() {
        return str330;
    }

    public void setStr330(String str330) {
        this.str330 = str330;
    }

    public String getStr331() {
        return str331;
    }

    public void setStr331(String str331) {
        this.str331 = str331;
    }

    public String getStr332() {
        return str332;
    }

    public void setStr332(String str332) {
        this.str332 = str332;
    }

    public String getStr333() {
        return str333;
    }

    public void setStr333(String str333) {
        this.str333 = str333;
    }

    public String getStr334() {
        return str334;
    }

    public void setStr334(String str334) {
        this.str334 = str334;
    }

    public String getStr335() {
        return str335;
    }

    public void setStr335(String str335) {
        this.str335 = str335;
    }

    public String getStr336() {
        return str336;
    }

    public void setStr336(String str336) {
        this.str336 = str336;
    }

    public String getStr337() {
        return str337;
    }

    public void setStr337(String str337) {
        this.str337 = str337;
    }

    public String getStr338() {
        return str338;
    }

    public void setStr338(String str338) {
        this.str338 = str338;
    }

    public String getStr339() {
        return str339;
    }

    public void setStr339(String str339) {
        this.str339 = str339;
    }

    public String getStr340() {
        return str340;
    }

    public void setStr340(String str340) {
        this.str340 = str340;
    }

    public String getStr341() {
        return str341;
    }

    public void setStr341(String str341) {
        this.str341 = str341;
    }

    public String getStr342() {
        return str342;
    }

    public void setStr342(String str342) {
        this.str342 = str342;
    }

    public String getStr343() {
        return str343;
    }

    public void setStr343(String str343) {
        this.str343 = str343;
    }

    public String getStr344() {
        return str344;
    }

    public void setStr344(String str344) {
        this.str344 = str344;
    }

    public String getStr345() {
        return str345;
    }

    public void setStr345(String str345) {
        this.str345 = str345;
    }

    public String getStr346() {
        return str346;
    }

    public void setStr346(String str346) {
        this.str346 = str346;
    }

    public String getStr347() {
        return str347;
    }

    public void setStr347(String str347) {
        this.str347 = str347;
    }

    public String getStr348() {
        return str348;
    }

    public void setStr348(String str348) {
        this.str348 = str348;
    }

    public String getStr349() {
        return str349;
    }

    public void setStr349(String str349) {
        this.str349 = str349;
    }

    public String getStr350() {
        return str350;
    }

    public void setStr350(String str350) {
        this.str350 = str350;
    }

    public String getStr351() {
        return str351;
    }

    public void setStr351(String str351) {
        this.str351 = str351;
    }

    public String getStr352() {
        return str352;
    }

    public void setStr352(String str352) {
        this.str352 = str352;
    }

    public String getStr353() {
        return str353;
    }

    public void setStr353(String str353) {
        this.str353 = str353;
    }

    public String getStr354() {
        return str354;
    }

    public void setStr354(String str354) {
        this.str354 = str354;
    }

    public String getStr355() {
        return str355;
    }

    public void setStr355(String str355) {
        this.str355 = str355;
    }

    public String getStr356() {
        return str356;
    }

    public void setStr356(String str356) {
        this.str356 = str356;
    }

    public String getStr357() {
        return str357;
    }

    public void setStr357(String str357) {
        this.str357 = str357;
    }

    public String getStr358() {
        return str358;
    }

    public void setStr358(String str358) {
        this.str358 = str358;
    }

    public String getStr359() {
        return str359;
    }

    public void setStr359(String str359) {
        this.str359 = str359;
    }

    public String getStr360() {
        return str360;
    }

    public void setStr360(String str360) {
        this.str360 = str360;
    }

    public String getStr361() {
        return str361;
    }

    public void setStr361(String str361) {
        this.str361 = str361;
    }

    public String getStr362() {
        return str362;
    }

    public void setStr362(String str362) {
        this.str362 = str362;
    }

    public String getStr363() {
        return str363;
    }

    public void setStr363(String str363) {
        this.str363 = str363;
    }

    public String getStr364() {
        return str364;
    }

    public void setStr364(String str364) {
        this.str364 = str364;
    }

    public String getStr365() {
        return str365;
    }

    public void setStr365(String str365) {
        this.str365 = str365;
    }

    public String getStr366() {
        return str366;
    }

    public void setStr366(String str366) {
        this.str366 = str366;
    }

    public String getStr367() {
        return str367;
    }

    public void setStr367(String str367) {
        this.str367 = str367;
    }

    public String getStr368() {
        return str368;
    }

    public void setStr368(String str368) {
        this.str368 = str368;
    }

    public String getStr369() {
        return str369;
    }

    public void setStr369(String str369) {
        this.str369 = str369;
    }

    public String getStr370() {
        return str370;
    }

    public void setStr370(String str370) {
        this.str370 = str370;
    }

    public String getStr371() {
        return str371;
    }

    public void setStr371(String str371) {
        this.str371 = str371;
    }

    public String getStr372() {
        return str372;
    }

    public void setStr372(String str372) {
        this.str372 = str372;
    }

    public String getStr373() {
        return str373;
    }

    public void setStr373(String str373) {
        this.str373 = str373;
    }

    public String getStr374() {
        return str374;
    }

    public void setStr374(String str374) {
        this.str374 = str374;
    }

    public String getStr375() {
        return str375;
    }

    public void setStr375(String str375) {
        this.str375 = str375;
    }

    public String getStr376() {
        return str376;
    }

    public void setStr376(String str376) {
        this.str376 = str376;
    }

    public String getStr377() {
        return str377;
    }

    public void setStr377(String str377) {
        this.str377 = str377;
    }

    public String getStr378() {
        return str378;
    }

    public void setStr378(String str378) {
        this.str378 = str378;
    }

    public String getStr379() {
        return str379;
    }

    public void setStr379(String str379) {
        this.str379 = str379;
    }

    public String getStr380() {
        return str380;
    }

    public void setStr380(String str380) {
        this.str380 = str380;
    }

    public String getStr381() {
        return str381;
    }

    public void setStr381(String str381) {
        this.str381 = str381;
    }

    public String getStr382() {
        return str382;
    }

    public void setStr382(String str382) {
        this.str382 = str382;
    }

    public String getStr383() {
        return str383;
    }

    public void setStr383(String str383) {
        this.str383 = str383;
    }

    public String getStr384() {
        return str384;
    }

    public void setStr384(String str384) {
        this.str384 = str384;
    }

    public String getStr385() {
        return str385;
    }

    public void setStr385(String str385) {
        this.str385 = str385;
    }

    public String getStr386() {
        return str386;
    }

    public void setStr386(String str386) {
        this.str386 = str386;
    }

    public String getStr387() {
        return str387;
    }

    public void setStr387(String str387) {
        this.str387 = str387;
    }

    public String getStr388() {
        return str388;
    }

    public void setStr388(String str388) {
        this.str388 = str388;
    }

    public String getStr389() {
        return str389;
    }

    public void setStr389(String str389) {
        this.str389 = str389;
    }

    public String getStr390() {
        return str390;
    }

    public void setStr390(String str390) {
        this.str390 = str390;
    }

    public String getStr391() {
        return str391;
    }

    public void setStr391(String str391) {
        this.str391 = str391;
    }

    public String getStr392() {
        return str392;
    }

    public void setStr392(String str392) {
        this.str392 = str392;
    }

    public String getStr393() {
        return str393;
    }

    public void setStr393(String str393) {
        this.str393 = str393;
    }

    public String getStr394() {
        return str394;
    }

    public void setStr394(String str394) {
        this.str394 = str394;
    }

    public String getStr395() {
        return str395;
    }

    public void setStr395(String str395) {
        this.str395 = str395;
    }

    public String getStr396() {
        return str396;
    }

    public void setStr396(String str396) {
        this.str396 = str396;
    }

    public String getStr397() {
        return str397;
    }

    public void setStr397(String str397) {
        this.str397 = str397;
    }

    public String getStr398() {
        return str398;
    }

    public void setStr398(String str398) {
        this.str398 = str398;
    }

    public String getStr399() {
        return str399;
    }

    public void setStr399(String str399) {
        this.str399 = str399;
    }

    public String getStr400() {
        return str400;
    }

    public void setStr400(String str400) {
        this.str400 = str400;
    }

    public String getStr401() {
        return str401;
    }

    public void setStr401(String str401) {
        this.str401 = str401;
    }

    public String getStr402() {
        return str402;
    }

    public void setStr402(String str402) {
        this.str402 = str402;
    }

    public String getStr403() {
        return str403;
    }

    public void setStr403(String str403) {
        this.str403 = str403;
    }

    public String getStr404() {
        return str404;
    }

    public void setStr404(String str404) {
        this.str404 = str404;
    }

    public String getStr405() {
        return str405;
    }

    public void setStr405(String str405) {
        this.str405 = str405;
    }

    public String getStr406() {
        return str406;
    }

    public void setStr406(String str406) {
        this.str406 = str406;
    }

    public String getStr407() {
        return str407;
    }

    public void setStr407(String str407) {
        this.str407 = str407;
    }

    public String getStr408() {
        return str408;
    }

    public void setStr408(String str408) {
        this.str408 = str408;
    }

    public String getStr409() {
        return str409;
    }

    public void setStr409(String str409) {
        this.str409 = str409;
    }

    public String getStr410() {
        return str410;
    }

    public void setStr410(String str410) {
        this.str410 = str410;
    }

    public String getStr411() {
        return str411;
    }

    public void setStr411(String str411) {
        this.str411 = str411;
    }

    public String getStr412() {
        return str412;
    }

    public void setStr412(String str412) {
        this.str412 = str412;
    }

    public String getStr413() {
        return str413;
    }

    public void setStr413(String str413) {
        this.str413 = str413;
    }

    public String getStr414() {
        return str414;
    }

    public void setStr414(String str414) {
        this.str414 = str414;
    }

    public String getStr415() {
        return str415;
    }

    public void setStr415(String str415) {
        this.str415 = str415;
    }

    public String getStr416() {
        return str416;
    }

    public void setStr416(String str416) {
        this.str416 = str416;
    }

    public String getStr417() {
        return str417;
    }

    public void setStr417(String str417) {
        this.str417 = str417;
    }

    public String getStr418() {
        return str418;
    }

    public void setStr418(String str418) {
        this.str418 = str418;
    }

    public String getStr419() {
        return str419;
    }

    public void setStr419(String str419) {
        this.str419 = str419;
    }

    public String getStr420() {
        return str420;
    }

    public void setStr420(String str420) {
        this.str420 = str420;
    }

    public String getStr421() {
        return str421;
    }

    public void setStr421(String str421) {
        this.str421 = str421;
    }

    public String getStr422() {
        return str422;
    }

    public void setStr422(String str422) {
        this.str422 = str422;
    }

    public String getStr423() {
        return str423;
    }

    public void setStr423(String str423) {
        this.str423 = str423;
    }

    public String getStr424() {
        return str424;
    }

    public void setStr424(String str424) {
        this.str424 = str424;
    }

    public String getStr425() {
        return str425;
    }

    public void setStr425(String str425) {
        this.str425 = str425;
    }

    public String getStr426() {
        return str426;
    }

    public void setStr426(String str426) {
        this.str426 = str426;
    }

    public String getStr427() {
        return str427;
    }

    public void setStr427(String str427) {
        this.str427 = str427;
    }

    public String getStr428() {
        return str428;
    }

    public void setStr428(String str428) {
        this.str428 = str428;
    }

    public String getStr429() {
        return str429;
    }

    public void setStr429(String str429) {
        this.str429 = str429;
    }

    public String getStr430() {
        return str430;
    }

    public void setStr430(String str430) {
        this.str430 = str430;
    }

    public String getStr431() {
        return str431;
    }

    public void setStr431(String str431) {
        this.str431 = str431;
    }

    public String getStr432() {
        return str432;
    }

    public void setStr432(String str432) {
        this.str432 = str432;
    }

    public String getStr433() {
        return str433;
    }

    public void setStr433(String str433) {
        this.str433 = str433;
    }

    public String getStr434() {
        return str434;
    }

    public void setStr434(String str434) {
        this.str434 = str434;
    }

    public String getStr435() {
        return str435;
    }

    public void setStr435(String str435) {
        this.str435 = str435;
    }

    public String getStr436() {
        return str436;
    }

    public void setStr436(String str436) {
        this.str436 = str436;
    }

    public String getStr437() {
        return str437;
    }

    public void setStr437(String str437) {
        this.str437 = str437;
    }

    public String getStr438() {
        return str438;
    }

    public void setStr438(String str438) {
        this.str438 = str438;
    }

    public String getStr439() {
        return str439;
    }

    public void setStr439(String str439) {
        this.str439 = str439;
    }

    public String getStr440() {
        return str440;
    }

    public void setStr440(String str440) {
        this.str440 = str440;
    }

    public String getStr441() {
        return str441;
    }

    public void setStr441(String str441) {
        this.str441 = str441;
    }

    public String getStr442() {
        return str442;
    }

    public void setStr442(String str442) {
        this.str442 = str442;
    }

    public String getStr443() {
        return str443;
    }

    public void setStr443(String str443) {
        this.str443 = str443;
    }

    public String getStr444() {
        return str444;
    }

    public void setStr444(String str444) {
        this.str444 = str444;
    }

    public String getStr445() {
        return str445;
    }

    public void setStr445(String str445) {
        this.str445 = str445;
    }

    public String getStr446() {
        return str446;
    }

    public void setStr446(String str446) {
        this.str446 = str446;
    }

    public String getStr447() {
        return str447;
    }

    public void setStr447(String str447) {
        this.str447 = str447;
    }

    public String getStr448() {
        return str448;
    }

    public void setStr448(String str448) {
        this.str448 = str448;
    }

    public String getStr449() {
        return str449;
    }

    public void setStr449(String str449) {
        this.str449 = str449;
    }

    public String getStr450() {
        return str450;
    }

    public void setStr450(String str450) {
        this.str450 = str450;
    }

    public String getStr451() {
        return str451;
    }

    public void setStr451(String str451) {
        this.str451 = str451;
    }

    public String getStr452() {
        return str452;
    }

    public void setStr452(String str452) {
        this.str452 = str452;
    }

    public String getStr453() {
        return str453;
    }

    public void setStr453(String str453) {
        this.str453 = str453;
    }

    public String getStr454() {
        return str454;
    }

    public void setStr454(String str454) {
        this.str454 = str454;
    }

    public String getStr455() {
        return str455;
    }

    public void setStr455(String str455) {
        this.str455 = str455;
    }

    public String getStr456() {
        return str456;
    }

    public void setStr456(String str456) {
        this.str456 = str456;
    }

    public String getStr457() {
        return str457;
    }

    public void setStr457(String str457) {
        this.str457 = str457;
    }

    public String getStr458() {
        return str458;
    }

    public void setStr458(String str458) {
        this.str458 = str458;
    }

    public String getStr459() {
        return str459;
    }

    public void setStr459(String str459) {
        this.str459 = str459;
    }

    public String getStr460() {
        return str460;
    }

    public void setStr460(String str460) {
        this.str460 = str460;
    }

    public String getStr461() {
        return str461;
    }

    public void setStr461(String str461) {
        this.str461 = str461;
    }

    public String getStr462() {
        return str462;
    }

    public void setStr462(String str462) {
        this.str462 = str462;
    }

    public String getStr463() {
        return str463;
    }

    public void setStr463(String str463) {
        this.str463 = str463;
    }

    public String getStr464() {
        return str464;
    }

    public void setStr464(String str464) {
        this.str464 = str464;
    }

    public String getStr465() {
        return str465;
    }

    public void setStr465(String str465) {
        this.str465 = str465;
    }

    public String getStr466() {
        return str466;
    }

    public void setStr466(String str466) {
        this.str466 = str466;
    }

    public String getStr467() {
        return str467;
    }

    public void setStr467(String str467) {
        this.str467 = str467;
    }

    public String getStr468() {
        return str468;
    }

    public void setStr468(String str468) {
        this.str468 = str468;
    }

    public String getStr469() {
        return str469;
    }

    public void setStr469(String str469) {
        this.str469 = str469;
    }

    public String getStr470() {
        return str470;
    }

    public void setStr470(String str470) {
        this.str470 = str470;
    }

    public String getStr471() {
        return str471;
    }

    public void setStr471(String str471) {
        this.str471 = str471;
    }

    public String getStr472() {
        return str472;
    }

    public void setStr472(String str472) {
        this.str472 = str472;
    }

    public String getStr473() {
        return str473;
    }

    public void setStr473(String str473) {
        this.str473 = str473;
    }

    public String getStr474() {
        return str474;
    }

    public void setStr474(String str474) {
        this.str474 = str474;
    }

    public String getStr475() {
        return str475;
    }

    public void setStr475(String str475) {
        this.str475 = str475;
    }

    public String getStr476() {
        return str476;
    }

    public void setStr476(String str476) {
        this.str476 = str476;
    }

    public String getStr477() {
        return str477;
    }

    public void setStr477(String str477) {
        this.str477 = str477;
    }

    public String getStr478() {
        return str478;
    }

    public void setStr478(String str478) {
        this.str478 = str478;
    }

    public String getStr479() {
        return str479;
    }

    public void setStr479(String str479) {
        this.str479 = str479;
    }

    public String getStr480() {
        return str480;
    }

    public void setStr480(String str480) {
        this.str480 = str480;
    }

    public String getStr481() {
        return str481;
    }

    public void setStr481(String str481) {
        this.str481 = str481;
    }

    public String getStr482() {
        return str482;
    }

    public void setStr482(String str482) {
        this.str482 = str482;
    }

    public String getStr483() {
        return str483;
    }

    public void setStr483(String str483) {
        this.str483 = str483;
    }

    public String getStr484() {
        return str484;
    }

    public void setStr484(String str484) {
        this.str484 = str484;
    }

    public String getStr485() {
        return str485;
    }

    public void setStr485(String str485) {
        this.str485 = str485;
    }

    public String getStr486() {
        return str486;
    }

    public void setStr486(String str486) {
        this.str486 = str486;
    }

    public String getStr487() {
        return str487;
    }

    public void setStr487(String str487) {
        this.str487 = str487;
    }

    public String getStr488() {
        return str488;
    }

    public void setStr488(String str488) {
        this.str488 = str488;
    }

    public String getStr489() {
        return str489;
    }

    public void setStr489(String str489) {
        this.str489 = str489;
    }

    public String getStr490() {
        return str490;
    }

    public void setStr490(String str490) {
        this.str490 = str490;
    }

    public String getStr491() {
        return str491;
    }

    public void setStr491(String str491) {
        this.str491 = str491;
    }

    public String getStr492() {
        return str492;
    }

    public void setStr492(String str492) {
        this.str492 = str492;
    }

    public String getStr493() {
        return str493;
    }

    public void setStr493(String str493) {
        this.str493 = str493;
    }

    public String getStr494() {
        return str494;
    }

    public void setStr494(String str494) {
        this.str494 = str494;
    }

    public String getStr495() {
        return str495;
    }

    public void setStr495(String str495) {
        this.str495 = str495;
    }

    public String getStr496() {
        return str496;
    }

    public void setStr496(String str496) {
        this.str496 = str496;
    }

    public String getStr497() {
        return str497;
    }

    public void setStr497(String str497) {
        this.str497 = str497;
    }

    public String getStr498() {
        return str498;
    }

    public void setStr498(String str498) {
        this.str498 = str498;
    }

    public int getInt1() {
        return int1;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    public int getInt2() {
        return int2;
    }

    public void setInt2(int int2) {
        this.int2 = int2;
    }

    public int getInt3() {
        return int3;
    }

    public void setInt3(int int3) {
        this.int3 = int3;
    }

    public int getInt4() {
        return int4;
    }

    public void setInt4(int int4) {
        this.int4 = int4;
    }

    public int getInt5() {
        return int5;
    }

    public void setInt5(int int5) {
        this.int5 = int5;
    }

    public int getInt6() {
        return int6;
    }

    public void setInt6(int int6) {
        this.int6 = int6;
    }

    public int getInt7() {
        return int7;
    }

    public void setInt7(int int7) {
        this.int7 = int7;
    }

    public int getInt8() {
        return int8;
    }

    public void setInt8(int int8) {
        this.int8 = int8;
    }

    public int getInt9() {
        return int9;
    }

    public void setInt9(int int9) {
        this.int9 = int9;
    }

    public int getInt10() {
        return int10;
    }

    public void setInt10(int int10) {
        this.int10 = int10;
    }

    public int getInt11() {
        return int11;
    }

    public void setInt11(int int11) {
        this.int11 = int11;
    }

    public int getInt12() {
        return int12;
    }

    public void setInt12(int int12) {
        this.int12 = int12;
    }

    public int getInt13() {
        return int13;
    }

    public void setInt13(int int13) {
        this.int13 = int13;
    }

    public int getInt14() {
        return int14;
    }

    public void setInt14(int int14) {
        this.int14 = int14;
    }

    public int getInt15() {
        return int15;
    }

    public void setInt15(int int15) {
        this.int15 = int15;
    }

    public int getInt16() {
        return int16;
    }

    public void setInt16(int int16) {
        this.int16 = int16;
    }

    public int getInt17() {
        return int17;
    }

    public void setInt17(int int17) {
        this.int17 = int17;
    }

    public int getInt18() {
        return int18;
    }

    public void setInt18(int int18) {
        this.int18 = int18;
    }

    public int getInt19() {
        return int19;
    }

    public void setInt19(int int19) {
        this.int19 = int19;
    }

    public int getInt20() {
        return int20;
    }

    public void setInt20(int int20) {
        this.int20 = int20;
    }

    public int getInt21() {
        return int21;
    }

    public void setInt21(int int21) {
        this.int21 = int21;
    }

    public int getInt22() {
        return int22;
    }

    public void setInt22(int int22) {
        this.int22 = int22;
    }

    public int getInt23() {
        return int23;
    }

    public void setInt23(int int23) {
        this.int23 = int23;
    }

    public int getInt24() {
        return int24;
    }

    public void setInt24(int int24) {
        this.int24 = int24;
    }

    public int getInt25() {
        return int25;
    }

    public void setInt25(int int25) {
        this.int25 = int25;
    }

    public int getInt26() {
        return int26;
    }

    public void setInt26(int int26) {
        this.int26 = int26;
    }

    public int getInt27() {
        return int27;
    }

    public void setInt27(int int27) {
        this.int27 = int27;
    }

    public int getInt28() {
        return int28;
    }

    public void setInt28(int int28) {
        this.int28 = int28;
    }

    public int getInt29() {
        return int29;
    }

    public void setInt29(int int29) {
        this.int29 = int29;
    }

    public int getInt30() {
        return int30;
    }

    public void setInt30(int int30) {
        this.int30 = int30;
    }

    public int getInt31() {
        return int31;
    }

    public void setInt31(int int31) {
        this.int31 = int31;
    }

    public int getInt32() {
        return int32;
    }

    public void setInt32(int int32) {
        this.int32 = int32;
    }

    public int getInt33() {
        return int33;
    }

    public void setInt33(int int33) {
        this.int33 = int33;
    }

    public int getInt34() {
        return int34;
    }

    public void setInt34(int int34) {
        this.int34 = int34;
    }

    public int getInt35() {
        return int35;
    }

    public void setInt35(int int35) {
        this.int35 = int35;
    }

    public int getInt36() {
        return int36;
    }

    public void setInt36(int int36) {
        this.int36 = int36;
    }

    public int getInt37() {
        return int37;
    }

    public void setInt37(int int37) {
        this.int37 = int37;
    }

    public int getInt38() {
        return int38;
    }

    public void setInt38(int int38) {
        this.int38 = int38;
    }

    public int getInt39() {
        return int39;
    }

    public void setInt39(int int39) {
        this.int39 = int39;
    }

    public int getInt40() {
        return int40;
    }

    public void setInt40(int int40) {
        this.int40 = int40;
    }

    public int getInt41() {
        return int41;
    }

    public void setInt41(int int41) {
        this.int41 = int41;
    }

    public int getInt42() {
        return int42;
    }

    public void setInt42(int int42) {
        this.int42 = int42;
    }

    public int getInt43() {
        return int43;
    }

    public void setInt43(int int43) {
        this.int43 = int43;
    }

    public int getInt44() {
        return int44;
    }

    public void setInt44(int int44) {
        this.int44 = int44;
    }

    public int getInt45() {
        return int45;
    }

    public void setInt45(int int45) {
        this.int45 = int45;
    }

    public int getInt46() {
        return int46;
    }

    public void setInt46(int int46) {
        this.int46 = int46;
    }

    public int getInt47() {
        return int47;
    }

    public void setInt47(int int47) {
        this.int47 = int47;
    }

    public int getInt48() {
        return int48;
    }

    public void setInt48(int int48) {
        this.int48 = int48;
    }

    public int getInt49() {
        return int49;
    }

    public void setInt49(int int49) {
        this.int49 = int49;
    }

    public int getInt50() {
        return int50;
    }

    public void setInt50(int int50) {
        this.int50 = int50;
    }

    public int getInt51() {
        return int51;
    }

    public void setInt51(int int51) {
        this.int51 = int51;
    }

    public int getInt52() {
        return int52;
    }

    public void setInt52(int int52) {
        this.int52 = int52;
    }

    public int getInt53() {
        return int53;
    }

    public void setInt53(int int53) {
        this.int53 = int53;
    }

    public int getInt54() {
        return int54;
    }

    public void setInt54(int int54) {
        this.int54 = int54;
    }

    public int getInt55() {
        return int55;
    }

    public void setInt55(int int55) {
        this.int55 = int55;
    }

    public int getInt56() {
        return int56;
    }

    public void setInt56(int int56) {
        this.int56 = int56;
    }

    public int getInt57() {
        return int57;
    }

    public void setInt57(int int57) {
        this.int57 = int57;
    }

    public int getInt58() {
        return int58;
    }

    public void setInt58(int int58) {
        this.int58 = int58;
    }

    public int getInt59() {
        return int59;
    }

    public void setInt59(int int59) {
        this.int59 = int59;
    }

    public int getInt60() {
        return int60;
    }

    public void setInt60(int int60) {
        this.int60 = int60;
    }

    public int getInt61() {
        return int61;
    }

    public void setInt61(int int61) {
        this.int61 = int61;
    }

    public int getInt62() {
        return int62;
    }

    public void setInt62(int int62) {
        this.int62 = int62;
    }

    public int getInt63() {
        return int63;
    }

    public void setInt63(int int63) {
        this.int63 = int63;
    }

    public int getInt64() {
        return int64;
    }

    public void setInt64(int int64) {
        this.int64 = int64;
    }

    public int getInt65() {
        return int65;
    }

    public void setInt65(int int65) {
        this.int65 = int65;
    }

    public int getInt66() {
        return int66;
    }

    public void setInt66(int int66) {
        this.int66 = int66;
    }

    public int getInt67() {
        return int67;
    }

    public void setInt67(int int67) {
        this.int67 = int67;
    }

    public int getInt68() {
        return int68;
    }

    public void setInt68(int int68) {
        this.int68 = int68;
    }

    public int getInt69() {
        return int69;
    }

    public void setInt69(int int69) {
        this.int69 = int69;
    }

    public int getInt70() {
        return int70;
    }

    public void setInt70(int int70) {
        this.int70 = int70;
    }

    public int getInt71() {
        return int71;
    }

    public void setInt71(int int71) {
        this.int71 = int71;
    }

    public int getInt72() {
        return int72;
    }

    public void setInt72(int int72) {
        this.int72 = int72;
    }

    public int getInt73() {
        return int73;
    }

    public void setInt73(int int73) {
        this.int73 = int73;
    }

    public int getInt74() {
        return int74;
    }

    public void setInt74(int int74) {
        this.int74 = int74;
    }

    public int getInt75() {
        return int75;
    }

    public void setInt75(int int75) {
        this.int75 = int75;
    }

    public int getInt76() {
        return int76;
    }

    public void setInt76(int int76) {
        this.int76 = int76;
    }

    public int getInt77() {
        return int77;
    }

    public void setInt77(int int77) {
        this.int77 = int77;
    }

    public int getInt78() {
        return int78;
    }

    public void setInt78(int int78) {
        this.int78 = int78;
    }

    public int getInt79() {
        return int79;
    }

    public void setInt79(int int79) {
        this.int79 = int79;
    }

    public int getInt80() {
        return int80;
    }

    public void setInt80(int int80) {
        this.int80 = int80;
    }

    public int getInt81() {
        return int81;
    }

    public void setInt81(int int81) {
        this.int81 = int81;
    }

    public int getInt82() {
        return int82;
    }

    public void setInt82(int int82) {
        this.int82 = int82;
    }

    public int getInt83() {
        return int83;
    }

    public void setInt83(int int83) {
        this.int83 = int83;
    }

    public int getInt84() {
        return int84;
    }

    public void setInt84(int int84) {
        this.int84 = int84;
    }

    public int getInt85() {
        return int85;
    }

    public void setInt85(int int85) {
        this.int85 = int85;
    }

    public int getInt86() {
        return int86;
    }

    public void setInt86(int int86) {
        this.int86 = int86;
    }

    public int getInt87() {
        return int87;
    }

    public void setInt87(int int87) {
        this.int87 = int87;
    }

    public int getInt88() {
        return int88;
    }

    public void setInt88(int int88) {
        this.int88 = int88;
    }

    public int getInt89() {
        return int89;
    }

    public void setInt89(int int89) {
        this.int89 = int89;
    }

    public int getInt90() {
        return int90;
    }

    public void setInt90(int int90) {
        this.int90 = int90;
    }

    public int getInt91() {
        return int91;
    }

    public void setInt91(int int91) {
        this.int91 = int91;
    }

    public int getInt92() {
        return int92;
    }

    public void setInt92(int int92) {
        this.int92 = int92;
    }

    public int getInt93() {
        return int93;
    }

    public void setInt93(int int93) {
        this.int93 = int93;
    }

    public int getInt94() {
        return int94;
    }

    public void setInt94(int int94) {
        this.int94 = int94;
    }

    public int getInt95() {
        return int95;
    }

    public void setInt95(int int95) {
        this.int95 = int95;
    }

    public int getInt96() {
        return int96;
    }

    public void setInt96(int int96) {
        this.int96 = int96;
    }

    public int getInt97() {
        return int97;
    }

    public void setInt97(int int97) {
        this.int97 = int97;
    }

    public int getInt98() {
        return int98;
    }

    public void setInt98(int int98) {
        this.int98 = int98;
    }

    public int getInt99() {
        return int99;
    }

    public void setInt99(int int99) {
        this.int99 = int99;
    }

    public int getInt100() {
        return int100;
    }

    public void setInt100(int int100) {
        this.int100 = int100;
    }

    public int getInt101() {
        return int101;
    }

    public void setInt101(int int101) {
        this.int101 = int101;
    }

    public int getInt102() {
        return int102;
    }

    public void setInt102(int int102) {
        this.int102 = int102;
    }

    public int getInt103() {
        return int103;
    }

    public void setInt103(int int103) {
        this.int103 = int103;
    }

    public int getInt104() {
        return int104;
    }

    public void setInt104(int int104) {
        this.int104 = int104;
    }

    public int getInt105() {
        return int105;
    }

    public void setInt105(int int105) {
        this.int105 = int105;
    }

    public int getInt106() {
        return int106;
    }

    public void setInt106(int int106) {
        this.int106 = int106;
    }

    public int getInt107() {
        return int107;
    }

    public void setInt107(int int107) {
        this.int107 = int107;
    }

    public int getInt108() {
        return int108;
    }

    public void setInt108(int int108) {
        this.int108 = int108;
    }

    public int getInt109() {
        return int109;
    }

    public void setInt109(int int109) {
        this.int109 = int109;
    }

    public int getInt110() {
        return int110;
    }

    public void setInt110(int int110) {
        this.int110 = int110;
    }

    public int getInt111() {
        return int111;
    }

    public void setInt111(int int111) {
        this.int111 = int111;
    }

    public int getInt112() {
        return int112;
    }

    public void setInt112(int int112) {
        this.int112 = int112;
    }

    public int getInt113() {
        return int113;
    }

    public void setInt113(int int113) {
        this.int113 = int113;
    }

    public int getInt114() {
        return int114;
    }

    public void setInt114(int int114) {
        this.int114 = int114;
    }

    public int getInt115() {
        return int115;
    }

    public void setInt115(int int115) {
        this.int115 = int115;
    }

    public int getInt116() {
        return int116;
    }

    public void setInt116(int int116) {
        this.int116 = int116;
    }

    public int getInt117() {
        return int117;
    }

    public void setInt117(int int117) {
        this.int117 = int117;
    }

    public int getInt118() {
        return int118;
    }

    public void setInt118(int int118) {
        this.int118 = int118;
    }

    public int getInt119() {
        return int119;
    }

    public void setInt119(int int119) {
        this.int119 = int119;
    }

    public int getInt120() {
        return int120;
    }

    public void setInt120(int int120) {
        this.int120 = int120;
    }

    public int getInt121() {
        return int121;
    }

    public void setInt121(int int121) {
        this.int121 = int121;
    }

    public int getInt122() {
        return int122;
    }

    public void setInt122(int int122) {
        this.int122 = int122;
    }

    public int getInt123() {
        return int123;
    }

    public void setInt123(int int123) {
        this.int123 = int123;
    }

    public int getInt124() {
        return int124;
    }

    public void setInt124(int int124) {
        this.int124 = int124;
    }

    public int getInt125() {
        return int125;
    }

    public void setInt125(int int125) {
        this.int125 = int125;
    }

    public int getInt126() {
        return int126;
    }

    public void setInt126(int int126) {
        this.int126 = int126;
    }

    public int getInt127() {
        return int127;
    }

    public void setInt127(int int127) {
        this.int127 = int127;
    }

    public int getInt128() {
        return int128;
    }

    public void setInt128(int int128) {
        this.int128 = int128;
    }

    public int getInt129() {
        return int129;
    }

    public void setInt129(int int129) {
        this.int129 = int129;
    }

    public int getInt130() {
        return int130;
    }

    public void setInt130(int int130) {
        this.int130 = int130;
    }

    public int getInt131() {
        return int131;
    }

    public void setInt131(int int131) {
        this.int131 = int131;
    }

    public int getInt132() {
        return int132;
    }

    public void setInt132(int int132) {
        this.int132 = int132;
    }

    public int getInt133() {
        return int133;
    }

    public void setInt133(int int133) {
        this.int133 = int133;
    }

    public int getInt134() {
        return int134;
    }

    public void setInt134(int int134) {
        this.int134 = int134;
    }

    public int getInt135() {
        return int135;
    }

    public void setInt135(int int135) {
        this.int135 = int135;
    }

    public int getInt136() {
        return int136;
    }

    public void setInt136(int int136) {
        this.int136 = int136;
    }

    public int getInt137() {
        return int137;
    }

    public void setInt137(int int137) {
        this.int137 = int137;
    }

    public int getInt138() {
        return int138;
    }

    public void setInt138(int int138) {
        this.int138 = int138;
    }

    public int getInt139() {
        return int139;
    }

    public void setInt139(int int139) {
        this.int139 = int139;
    }

    public int getInt140() {
        return int140;
    }

    public void setInt140(int int140) {
        this.int140 = int140;
    }

    public int getInt141() {
        return int141;
    }

    public void setInt141(int int141) {
        this.int141 = int141;
    }

    public int getInt142() {
        return int142;
    }

    public void setInt142(int int142) {
        this.int142 = int142;
    }

    public int getInt143() {
        return int143;
    }

    public void setInt143(int int143) {
        this.int143 = int143;
    }

    public int getInt144() {
        return int144;
    }

    public void setInt144(int int144) {
        this.int144 = int144;
    }

    public int getInt145() {
        return int145;
    }

    public void setInt145(int int145) {
        this.int145 = int145;
    }

    public int getInt146() {
        return int146;
    }

    public void setInt146(int int146) {
        this.int146 = int146;
    }

    public int getInt147() {
        return int147;
    }

    public void setInt147(int int147) {
        this.int147 = int147;
    }

    public int getInt148() {
        return int148;
    }

    public void setInt148(int int148) {
        this.int148 = int148;
    }

    public int getInt149() {
        return int149;
    }

    public void setInt149(int int149) {
        this.int149 = int149;
    }

    public int getInt150() {
        return int150;
    }

    public void setInt150(int int150) {
        this.int150 = int150;
    }

    public int getInt151() {
        return int151;
    }

    public void setInt151(int int151) {
        this.int151 = int151;
    }

    public int getInt152() {
        return int152;
    }

    public void setInt152(int int152) {
        this.int152 = int152;
    }

    public int getInt153() {
        return int153;
    }

    public void setInt153(int int153) {
        this.int153 = int153;
    }

    public int getInt154() {
        return int154;
    }

    public void setInt154(int int154) {
        this.int154 = int154;
    }

    public int getInt155() {
        return int155;
    }

    public void setInt155(int int155) {
        this.int155 = int155;
    }

    public int getInt156() {
        return int156;
    }

    public void setInt156(int int156) {
        this.int156 = int156;
    }

    public int getInt157() {
        return int157;
    }

    public void setInt157(int int157) {
        this.int157 = int157;
    }

    public int getInt158() {
        return int158;
    }

    public void setInt158(int int158) {
        this.int158 = int158;
    }

    public int getInt159() {
        return int159;
    }

    public void setInt159(int int159) {
        this.int159 = int159;
    }

    public int getInt160() {
        return int160;
    }

    public void setInt160(int int160) {
        this.int160 = int160;
    }

    public int getInt161() {
        return int161;
    }

    public void setInt161(int int161) {
        this.int161 = int161;
    }

    public int getInt162() {
        return int162;
    }

    public void setInt162(int int162) {
        this.int162 = int162;
    }

    public int getInt163() {
        return int163;
    }

    public void setInt163(int int163) {
        this.int163 = int163;
    }

    public int getInt164() {
        return int164;
    }

    public void setInt164(int int164) {
        this.int164 = int164;
    }

    public int getInt165() {
        return int165;
    }

    public void setInt165(int int165) {
        this.int165 = int165;
    }

    public int getInt166() {
        return int166;
    }

    public void setInt166(int int166) {
        this.int166 = int166;
    }

    public int getInt167() {
        return int167;
    }

    public void setInt167(int int167) {
        this.int167 = int167;
    }

    public int getInt168() {
        return int168;
    }

    public void setInt168(int int168) {
        this.int168 = int168;
    }

    public int getInt169() {
        return int169;
    }

    public void setInt169(int int169) {
        this.int169 = int169;
    }

    public int getInt170() {
        return int170;
    }

    public void setInt170(int int170) {
        this.int170 = int170;
    }

    public int getInt171() {
        return int171;
    }

    public void setInt171(int int171) {
        this.int171 = int171;
    }

    public int getInt172() {
        return int172;
    }

    public void setInt172(int int172) {
        this.int172 = int172;
    }

    public int getInt173() {
        return int173;
    }

    public void setInt173(int int173) {
        this.int173 = int173;
    }

    public int getInt174() {
        return int174;
    }

    public void setInt174(int int174) {
        this.int174 = int174;
    }

    public int getInt175() {
        return int175;
    }

    public void setInt175(int int175) {
        this.int175 = int175;
    }

    public int getInt176() {
        return int176;
    }

    public void setInt176(int int176) {
        this.int176 = int176;
    }

    public int getInt177() {
        return int177;
    }

    public void setInt177(int int177) {
        this.int177 = int177;
    }

    public int getInt178() {
        return int178;
    }

    public void setInt178(int int178) {
        this.int178 = int178;
    }

    public int getInt179() {
        return int179;
    }

    public void setInt179(int int179) {
        this.int179 = int179;
    }

    public int getInt180() {
        return int180;
    }

    public void setInt180(int int180) {
        this.int180 = int180;
    }

    public int getInt181() {
        return int181;
    }

    public void setInt181(int int181) {
        this.int181 = int181;
    }

    public int getInt182() {
        return int182;
    }

    public void setInt182(int int182) {
        this.int182 = int182;
    }

    public int getInt183() {
        return int183;
    }

    public void setInt183(int int183) {
        this.int183 = int183;
    }

    public int getInt184() {
        return int184;
    }

    public void setInt184(int int184) {
        this.int184 = int184;
    }

    public int getInt185() {
        return int185;
    }

    public void setInt185(int int185) {
        this.int185 = int185;
    }

    public int getInt186() {
        return int186;
    }

    public void setInt186(int int186) {
        this.int186 = int186;
    }

    public int getInt187() {
        return int187;
    }

    public void setInt187(int int187) {
        this.int187 = int187;
    }

    public int getInt188() {
        return int188;
    }

    public void setInt188(int int188) {
        this.int188 = int188;
    }

    public int getInt189() {
        return int189;
    }

    public void setInt189(int int189) {
        this.int189 = int189;
    }

    public int getInt190() {
        return int190;
    }

    public void setInt190(int int190) {
        this.int190 = int190;
    }

    public int getInt191() {
        return int191;
    }

    public void setInt191(int int191) {
        this.int191 = int191;
    }

    public int getInt192() {
        return int192;
    }

    public void setInt192(int int192) {
        this.int192 = int192;
    }

    public int getInt193() {
        return int193;
    }

    public void setInt193(int int193) {
        this.int193 = int193;
    }

    public int getInt194() {
        return int194;
    }

    public void setInt194(int int194) {
        this.int194 = int194;
    }

    public int getInt195() {
        return int195;
    }

    public void setInt195(int int195) {
        this.int195 = int195;
    }

    public int getInt196() {
        return int196;
    }

    public void setInt196(int int196) {
        this.int196 = int196;
    }

    public int getInt197() {
        return int197;
    }

    public void setInt197(int int197) {
        this.int197 = int197;
    }

    public int getInt198() {
        return int198;
    }

    public void setInt198(int int198) {
        this.int198 = int198;
    }

    public int getInt199() {
        return int199;
    }

    public void setInt199(int int199) {
        this.int199 = int199;
    }

    public int getInt200() {
        return int200;
    }

    public void setInt200(int int200) {
        this.int200 = int200;
    }

    public int getInt201() {
        return int201;
    }

    public void setInt201(int int201) {
        this.int201 = int201;
    }

    public int getInt202() {
        return int202;
    }

    public void setInt202(int int202) {
        this.int202 = int202;
    }

    public int getInt203() {
        return int203;
    }

    public void setInt203(int int203) {
        this.int203 = int203;
    }

    public int getInt204() {
        return int204;
    }

    public void setInt204(int int204) {
        this.int204 = int204;
    }

    public int getInt205() {
        return int205;
    }

    public void setInt205(int int205) {
        this.int205 = int205;
    }

    public int getInt206() {
        return int206;
    }

    public void setInt206(int int206) {
        this.int206 = int206;
    }

    public int getInt207() {
        return int207;
    }

    public void setInt207(int int207) {
        this.int207 = int207;
    }

    public int getInt208() {
        return int208;
    }

    public void setInt208(int int208) {
        this.int208 = int208;
    }

    public int getInt209() {
        return int209;
    }

    public void setInt209(int int209) {
        this.int209 = int209;
    }

    public int getInt210() {
        return int210;
    }

    public void setInt210(int int210) {
        this.int210 = int210;
    }

    public int getInt211() {
        return int211;
    }

    public void setInt211(int int211) {
        this.int211 = int211;
    }

    public int getInt212() {
        return int212;
    }

    public void setInt212(int int212) {
        this.int212 = int212;
    }

    public int getInt213() {
        return int213;
    }

    public void setInt213(int int213) {
        this.int213 = int213;
    }

    public int getInt214() {
        return int214;
    }

    public void setInt214(int int214) {
        this.int214 = int214;
    }

    public int getInt215() {
        return int215;
    }

    public void setInt215(int int215) {
        this.int215 = int215;
    }

    public int getInt216() {
        return int216;
    }

    public void setInt216(int int216) {
        this.int216 = int216;
    }

    public int getInt217() {
        return int217;
    }

    public void setInt217(int int217) {
        this.int217 = int217;
    }

    public int getInt218() {
        return int218;
    }

    public void setInt218(int int218) {
        this.int218 = int218;
    }

    public int getInt219() {
        return int219;
    }

    public void setInt219(int int219) {
        this.int219 = int219;
    }

    public int getInt220() {
        return int220;
    }

    public void setInt220(int int220) {
        this.int220 = int220;
    }

    public int getInt221() {
        return int221;
    }

    public void setInt221(int int221) {
        this.int221 = int221;
    }

    public int getInt222() {
        return int222;
    }

    public void setInt222(int int222) {
        this.int222 = int222;
    }

    public int getInt223() {
        return int223;
    }

    public void setInt223(int int223) {
        this.int223 = int223;
    }

    public int getInt224() {
        return int224;
    }

    public void setInt224(int int224) {
        this.int224 = int224;
    }

    public int getInt225() {
        return int225;
    }

    public void setInt225(int int225) {
        this.int225 = int225;
    }

    public int getInt226() {
        return int226;
    }

    public void setInt226(int int226) {
        this.int226 = int226;
    }

    public int getInt227() {
        return int227;
    }

    public void setInt227(int int227) {
        this.int227 = int227;
    }

    public int getInt228() {
        return int228;
    }

    public void setInt228(int int228) {
        this.int228 = int228;
    }

    public int getInt229() {
        return int229;
    }

    public void setInt229(int int229) {
        this.int229 = int229;
    }

    public int getInt230() {
        return int230;
    }

    public void setInt230(int int230) {
        this.int230 = int230;
    }

    public int getInt231() {
        return int231;
    }

    public void setInt231(int int231) {
        this.int231 = int231;
    }

    public int getInt232() {
        return int232;
    }

    public void setInt232(int int232) {
        this.int232 = int232;
    }

    public int getInt233() {
        return int233;
    }

    public void setInt233(int int233) {
        this.int233 = int233;
    }

    public int getInt234() {
        return int234;
    }

    public void setInt234(int int234) {
        this.int234 = int234;
    }

    public int getInt235() {
        return int235;
    }

    public void setInt235(int int235) {
        this.int235 = int235;
    }

    public int getInt236() {
        return int236;
    }

    public void setInt236(int int236) {
        this.int236 = int236;
    }

    public int getInt237() {
        return int237;
    }

    public void setInt237(int int237) {
        this.int237 = int237;
    }

    public int getInt238() {
        return int238;
    }

    public void setInt238(int int238) {
        this.int238 = int238;
    }

    public int getInt239() {
        return int239;
    }

    public void setInt239(int int239) {
        this.int239 = int239;
    }

    public int getInt240() {
        return int240;
    }

    public void setInt240(int int240) {
        this.int240 = int240;
    }

    public int getInt241() {
        return int241;
    }

    public void setInt241(int int241) {
        this.int241 = int241;
    }

    public int getInt242() {
        return int242;
    }

    public void setInt242(int int242) {
        this.int242 = int242;
    }

    public int getInt243() {
        return int243;
    }

    public void setInt243(int int243) {
        this.int243 = int243;
    }

    public int getInt244() {
        return int244;
    }

    public void setInt244(int int244) {
        this.int244 = int244;
    }

    public int getInt245() {
        return int245;
    }

    public void setInt245(int int245) {
        this.int245 = int245;
    }

    public int getInt246() {
        return int246;
    }

    public void setInt246(int int246) {
        this.int246 = int246;
    }

    public int getInt247() {
        return int247;
    }

    public void setInt247(int int247) {
        this.int247 = int247;
    }

    public int getInt248() {
        return int248;
    }

    public void setInt248(int int248) {
        this.int248 = int248;
    }

    public int getInt249() {
        return int249;
    }

    public void setInt249(int int249) {
        this.int249 = int249;
    }

    public int getInt250() {
        return int250;
    }

    public void setInt250(int int250) {
        this.int250 = int250;
    }

    public int getInt251() {
        return int251;
    }

    public void setInt251(int int251) {
        this.int251 = int251;
    }

    public int getInt252() {
        return int252;
    }

    public void setInt252(int int252) {
        this.int252 = int252;
    }

    public int getInt253() {
        return int253;
    }

    public void setInt253(int int253) {
        this.int253 = int253;
    }

    public int getInt254() {
        return int254;
    }

    public void setInt254(int int254) {
        this.int254 = int254;
    }

    public int getInt255() {
        return int255;
    }

    public void setInt255(int int255) {
        this.int255 = int255;
    }

    public int getInt256() {
        return int256;
    }

    public void setInt256(int int256) {
        this.int256 = int256;
    }

    public int getInt257() {
        return int257;
    }

    public void setInt257(int int257) {
        this.int257 = int257;
    }

    public int getInt258() {
        return int258;
    }

    public void setInt258(int int258) {
        this.int258 = int258;
    }

    public int getInt259() {
        return int259;
    }

    public void setInt259(int int259) {
        this.int259 = int259;
    }

    public int getInt260() {
        return int260;
    }

    public void setInt260(int int260) {
        this.int260 = int260;
    }

    public int getInt261() {
        return int261;
    }

    public void setInt261(int int261) {
        this.int261 = int261;
    }

    public int getInt262() {
        return int262;
    }

    public void setInt262(int int262) {
        this.int262 = int262;
    }

    public int getInt263() {
        return int263;
    }

    public void setInt263(int int263) {
        this.int263 = int263;
    }

    public int getInt264() {
        return int264;
    }

    public void setInt264(int int264) {
        this.int264 = int264;
    }

    public int getInt265() {
        return int265;
    }

    public void setInt265(int int265) {
        this.int265 = int265;
    }

    public int getInt266() {
        return int266;
    }

    public void setInt266(int int266) {
        this.int266 = int266;
    }

    public int getInt267() {
        return int267;
    }

    public void setInt267(int int267) {
        this.int267 = int267;
    }

    public int getInt268() {
        return int268;
    }

    public void setInt268(int int268) {
        this.int268 = int268;
    }

    public int getInt269() {
        return int269;
    }

    public void setInt269(int int269) {
        this.int269 = int269;
    }

    public int getInt270() {
        return int270;
    }

    public void setInt270(int int270) {
        this.int270 = int270;
    }

    public int getInt271() {
        return int271;
    }

    public void setInt271(int int271) {
        this.int271 = int271;
    }

    public int getInt272() {
        return int272;
    }

    public void setInt272(int int272) {
        this.int272 = int272;
    }

    public int getInt273() {
        return int273;
    }

    public void setInt273(int int273) {
        this.int273 = int273;
    }

    public int getInt274() {
        return int274;
    }

    public void setInt274(int int274) {
        this.int274 = int274;
    }

    public int getInt275() {
        return int275;
    }

    public void setInt275(int int275) {
        this.int275 = int275;
    }

    public int getInt276() {
        return int276;
    }

    public void setInt276(int int276) {
        this.int276 = int276;
    }

    public int getInt277() {
        return int277;
    }

    public void setInt277(int int277) {
        this.int277 = int277;
    }

    public int getInt278() {
        return int278;
    }

    public void setInt278(int int278) {
        this.int278 = int278;
    }

    public int getInt279() {
        return int279;
    }

    public void setInt279(int int279) {
        this.int279 = int279;
    }

    public int getInt280() {
        return int280;
    }

    public void setInt280(int int280) {
        this.int280 = int280;
    }

    public int getInt281() {
        return int281;
    }

    public void setInt281(int int281) {
        this.int281 = int281;
    }

    public int getInt282() {
        return int282;
    }

    public void setInt282(int int282) {
        this.int282 = int282;
    }

    public int getInt283() {
        return int283;
    }

    public void setInt283(int int283) {
        this.int283 = int283;
    }

    public int getInt284() {
        return int284;
    }

    public void setInt284(int int284) {
        this.int284 = int284;
    }

    public int getInt285() {
        return int285;
    }

    public void setInt285(int int285) {
        this.int285 = int285;
    }

    public int getInt286() {
        return int286;
    }

    public void setInt286(int int286) {
        this.int286 = int286;
    }

    public int getInt287() {
        return int287;
    }

    public void setInt287(int int287) {
        this.int287 = int287;
    }

    public int getInt288() {
        return int288;
    }

    public void setInt288(int int288) {
        this.int288 = int288;
    }

    public int getInt289() {
        return int289;
    }

    public void setInt289(int int289) {
        this.int289 = int289;
    }

    public int getInt290() {
        return int290;
    }

    public void setInt290(int int290) {
        this.int290 = int290;
    }

    public int getInt291() {
        return int291;
    }

    public void setInt291(int int291) {
        this.int291 = int291;
    }

    public int getInt292() {
        return int292;
    }

    public void setInt292(int int292) {
        this.int292 = int292;
    }

    public int getInt293() {
        return int293;
    }

    public void setInt293(int int293) {
        this.int293 = int293;
    }

    public int getInt294() {
        return int294;
    }

    public void setInt294(int int294) {
        this.int294 = int294;
    }

    public int getInt295() {
        return int295;
    }

    public void setInt295(int int295) {
        this.int295 = int295;
    }

    public int getInt296() {
        return int296;
    }

    public void setInt296(int int296) {
        this.int296 = int296;
    }

    public int getInt297() {
        return int297;
    }

    public void setInt297(int int297) {
        this.int297 = int297;
    }

    public int getInt298() {
        return int298;
    }

    public void setInt298(int int298) {
        this.int298 = int298;
    }

    public int getInt299() {
        return int299;
    }

    public void setInt299(int int299) {
        this.int299 = int299;
    }

    public int getInt300() {
        return int300;
    }

    public void setInt300(int int300) {
        this.int300 = int300;
    }

    public int getInt301() {
        return int301;
    }

    public void setInt301(int int301) {
        this.int301 = int301;
    }

    public int getInt302() {
        return int302;
    }

    public void setInt302(int int302) {
        this.int302 = int302;
    }

    public int getInt303() {
        return int303;
    }

    public void setInt303(int int303) {
        this.int303 = int303;
    }

    public int getInt304() {
        return int304;
    }

    public void setInt304(int int304) {
        this.int304 = int304;
    }

    public int getInt305() {
        return int305;
    }

    public void setInt305(int int305) {
        this.int305 = int305;
    }

    public int getInt306() {
        return int306;
    }

    public void setInt306(int int306) {
        this.int306 = int306;
    }

    public int getInt307() {
        return int307;
    }

    public void setInt307(int int307) {
        this.int307 = int307;
    }

    public int getInt308() {
        return int308;
    }

    public void setInt308(int int308) {
        this.int308 = int308;
    }

    public int getInt309() {
        return int309;
    }

    public void setInt309(int int309) {
        this.int309 = int309;
    }

    public int getInt310() {
        return int310;
    }

    public void setInt310(int int310) {
        this.int310 = int310;
    }

    public int getInt311() {
        return int311;
    }

    public void setInt311(int int311) {
        this.int311 = int311;
    }

    public int getInt312() {
        return int312;
    }

    public void setInt312(int int312) {
        this.int312 = int312;
    }

    public int getInt313() {
        return int313;
    }

    public void setInt313(int int313) {
        this.int313 = int313;
    }

    public int getInt314() {
        return int314;
    }

    public void setInt314(int int314) {
        this.int314 = int314;
    }

    public int getInt315() {
        return int315;
    }

    public void setInt315(int int315) {
        this.int315 = int315;
    }

    public int getInt316() {
        return int316;
    }

    public void setInt316(int int316) {
        this.int316 = int316;
    }

    public int getInt317() {
        return int317;
    }

    public void setInt317(int int317) {
        this.int317 = int317;
    }

    public int getInt318() {
        return int318;
    }

    public void setInt318(int int318) {
        this.int318 = int318;
    }

    public int getInt319() {
        return int319;
    }

    public void setInt319(int int319) {
        this.int319 = int319;
    }

    public int getInt320() {
        return int320;
    }

    public void setInt320(int int320) {
        this.int320 = int320;
    }

    public int getInt321() {
        return int321;
    }

    public void setInt321(int int321) {
        this.int321 = int321;
    }

    public int getInt322() {
        return int322;
    }

    public void setInt322(int int322) {
        this.int322 = int322;
    }

    public int getInt323() {
        return int323;
    }

    public void setInt323(int int323) {
        this.int323 = int323;
    }

    public int getInt324() {
        return int324;
    }

    public void setInt324(int int324) {
        this.int324 = int324;
    }

    public int getInt325() {
        return int325;
    }

    public void setInt325(int int325) {
        this.int325 = int325;
    }

    public int getInt326() {
        return int326;
    }

    public void setInt326(int int326) {
        this.int326 = int326;
    }

    public int getInt327() {
        return int327;
    }

    public void setInt327(int int327) {
        this.int327 = int327;
    }

    public int getInt328() {
        return int328;
    }

    public void setInt328(int int328) {
        this.int328 = int328;
    }

    public int getInt329() {
        return int329;
    }

    public void setInt329(int int329) {
        this.int329 = int329;
    }

    public int getInt330() {
        return int330;
    }

    public void setInt330(int int330) {
        this.int330 = int330;
    }

    public int getInt331() {
        return int331;
    }

    public void setInt331(int int331) {
        this.int331 = int331;
    }

    public int getInt332() {
        return int332;
    }

    public void setInt332(int int332) {
        this.int332 = int332;
    }

    public int getInt333() {
        return int333;
    }

    public void setInt333(int int333) {
        this.int333 = int333;
    }

    public int getInt334() {
        return int334;
    }

    public void setInt334(int int334) {
        this.int334 = int334;
    }

    public int getInt335() {
        return int335;
    }

    public void setInt335(int int335) {
        this.int335 = int335;
    }

    public int getInt336() {
        return int336;
    }

    public void setInt336(int int336) {
        this.int336 = int336;
    }

    public int getInt337() {
        return int337;
    }

    public void setInt337(int int337) {
        this.int337 = int337;
    }

    public int getInt338() {
        return int338;
    }

    public void setInt338(int int338) {
        this.int338 = int338;
    }

    public int getInt339() {
        return int339;
    }

    public void setInt339(int int339) {
        this.int339 = int339;
    }

    public int getInt340() {
        return int340;
    }

    public void setInt340(int int340) {
        this.int340 = int340;
    }

    public int getInt341() {
        return int341;
    }

    public void setInt341(int int341) {
        this.int341 = int341;
    }

    public int getInt342() {
        return int342;
    }

    public void setInt342(int int342) {
        this.int342 = int342;
    }

    public int getInt343() {
        return int343;
    }

    public void setInt343(int int343) {
        this.int343 = int343;
    }

    public int getInt344() {
        return int344;
    }

    public void setInt344(int int344) {
        this.int344 = int344;
    }

    public int getInt345() {
        return int345;
    }

    public void setInt345(int int345) {
        this.int345 = int345;
    }

    public int getInt346() {
        return int346;
    }

    public void setInt346(int int346) {
        this.int346 = int346;
    }

    public int getInt347() {
        return int347;
    }

    public void setInt347(int int347) {
        this.int347 = int347;
    }

    public int getInt348() {
        return int348;
    }

    public void setInt348(int int348) {
        this.int348 = int348;
    }

    public int getInt349() {
        return int349;
    }

    public void setInt349(int int349) {
        this.int349 = int349;
    }

    public int getInt350() {
        return int350;
    }

    public void setInt350(int int350) {
        this.int350 = int350;
    }

    public int getInt351() {
        return int351;
    }

    public void setInt351(int int351) {
        this.int351 = int351;
    }

    public int getInt352() {
        return int352;
    }

    public void setInt352(int int352) {
        this.int352 = int352;
    }

    public int getInt353() {
        return int353;
    }

    public void setInt353(int int353) {
        this.int353 = int353;
    }

    public int getInt354() {
        return int354;
    }

    public void setInt354(int int354) {
        this.int354 = int354;
    }

    public int getInt355() {
        return int355;
    }

    public void setInt355(int int355) {
        this.int355 = int355;
    }

    public int getInt356() {
        return int356;
    }

    public void setInt356(int int356) {
        this.int356 = int356;
    }

    public int getInt357() {
        return int357;
    }

    public void setInt357(int int357) {
        this.int357 = int357;
    }

    public int getInt358() {
        return int358;
    }

    public void setInt358(int int358) {
        this.int358 = int358;
    }

    public int getInt359() {
        return int359;
    }

    public void setInt359(int int359) {
        this.int359 = int359;
    }

    public int getInt360() {
        return int360;
    }

    public void setInt360(int int360) {
        this.int360 = int360;
    }

    public int getInt361() {
        return int361;
    }

    public void setInt361(int int361) {
        this.int361 = int361;
    }

    public int getInt362() {
        return int362;
    }

    public void setInt362(int int362) {
        this.int362 = int362;
    }

    public int getInt363() {
        return int363;
    }

    public void setInt363(int int363) {
        this.int363 = int363;
    }

    public int getInt364() {
        return int364;
    }

    public void setInt364(int int364) {
        this.int364 = int364;
    }

    public int getInt365() {
        return int365;
    }

    public void setInt365(int int365) {
        this.int365 = int365;
    }

    public int getInt366() {
        return int366;
    }

    public void setInt366(int int366) {
        this.int366 = int366;
    }

    public int getInt367() {
        return int367;
    }

    public void setInt367(int int367) {
        this.int367 = int367;
    }

    public int getInt368() {
        return int368;
    }

    public void setInt368(int int368) {
        this.int368 = int368;
    }

    public int getInt369() {
        return int369;
    }

    public void setInt369(int int369) {
        this.int369 = int369;
    }

    public int getInt370() {
        return int370;
    }

    public void setInt370(int int370) {
        this.int370 = int370;
    }

    public int getInt371() {
        return int371;
    }

    public void setInt371(int int371) {
        this.int371 = int371;
    }

    public int getInt372() {
        return int372;
    }

    public void setInt372(int int372) {
        this.int372 = int372;
    }

    public int getInt373() {
        return int373;
    }

    public void setInt373(int int373) {
        this.int373 = int373;
    }

    public int getInt374() {
        return int374;
    }

    public void setInt374(int int374) {
        this.int374 = int374;
    }

    public int getInt375() {
        return int375;
    }

    public void setInt375(int int375) {
        this.int375 = int375;
    }

    public int getInt376() {
        return int376;
    }

    public void setInt376(int int376) {
        this.int376 = int376;
    }

    public int getInt377() {
        return int377;
    }

    public void setInt377(int int377) {
        this.int377 = int377;
    }

    public int getInt378() {
        return int378;
    }

    public void setInt378(int int378) {
        this.int378 = int378;
    }

    public int getInt379() {
        return int379;
    }

    public void setInt379(int int379) {
        this.int379 = int379;
    }

    public int getInt380() {
        return int380;
    }

    public void setInt380(int int380) {
        this.int380 = int380;
    }

    public int getInt381() {
        return int381;
    }

    public void setInt381(int int381) {
        this.int381 = int381;
    }

    public int getInt382() {
        return int382;
    }

    public void setInt382(int int382) {
        this.int382 = int382;
    }

    public int getInt383() {
        return int383;
    }

    public void setInt383(int int383) {
        this.int383 = int383;
    }

    public int getInt384() {
        return int384;
    }

    public void setInt384(int int384) {
        this.int384 = int384;
    }

    public int getInt385() {
        return int385;
    }

    public void setInt385(int int385) {
        this.int385 = int385;
    }

    public int getInt386() {
        return int386;
    }

    public void setInt386(int int386) {
        this.int386 = int386;
    }

    public int getInt387() {
        return int387;
    }

    public void setInt387(int int387) {
        this.int387 = int387;
    }

    public int getInt388() {
        return int388;
    }

    public void setInt388(int int388) {
        this.int388 = int388;
    }

    public int getInt389() {
        return int389;
    }

    public void setInt389(int int389) {
        this.int389 = int389;
    }

    public int getInt390() {
        return int390;
    }

    public void setInt390(int int390) {
        this.int390 = int390;
    }

    public int getInt391() {
        return int391;
    }

    public void setInt391(int int391) {
        this.int391 = int391;
    }

    public int getInt392() {
        return int392;
    }

    public void setInt392(int int392) {
        this.int392 = int392;
    }

    public int getInt393() {
        return int393;
    }

    public void setInt393(int int393) {
        this.int393 = int393;
    }

    public int getInt394() {
        return int394;
    }

    public void setInt394(int int394) {
        this.int394 = int394;
    }

    public int getInt395() {
        return int395;
    }

    public void setInt395(int int395) {
        this.int395 = int395;
    }

    public int getInt396() {
        return int396;
    }

    public void setInt396(int int396) {
        this.int396 = int396;
    }

    public int getInt397() {
        return int397;
    }

    public void setInt397(int int397) {
        this.int397 = int397;
    }

    public int getInt398() {
        return int398;
    }

    public void setInt398(int int398) {
        this.int398 = int398;
    }

    public int getInt399() {
        return int399;
    }

    public void setInt399(int int399) {
        this.int399 = int399;
    }

    public int getInt400() {
        return int400;
    }

    public void setInt400(int int400) {
        this.int400 = int400;
    }

    public int getInt401() {
        return int401;
    }

    public void setInt401(int int401) {
        this.int401 = int401;
    }

    public int getInt402() {
        return int402;
    }

    public void setInt402(int int402) {
        this.int402 = int402;
    }

    public int getInt403() {
        return int403;
    }

    public void setInt403(int int403) {
        this.int403 = int403;
    }

    public int getInt404() {
        return int404;
    }

    public void setInt404(int int404) {
        this.int404 = int404;
    }

    public int getInt405() {
        return int405;
    }

    public void setInt405(int int405) {
        this.int405 = int405;
    }

    public int getInt406() {
        return int406;
    }

    public void setInt406(int int406) {
        this.int406 = int406;
    }

    public int getInt407() {
        return int407;
    }

    public void setInt407(int int407) {
        this.int407 = int407;
    }

    public int getInt408() {
        return int408;
    }

    public void setInt408(int int408) {
        this.int408 = int408;
    }

    public int getInt409() {
        return int409;
    }

    public void setInt409(int int409) {
        this.int409 = int409;
    }

    public int getInt410() {
        return int410;
    }

    public void setInt410(int int410) {
        this.int410 = int410;
    }

    public int getInt411() {
        return int411;
    }

    public void setInt411(int int411) {
        this.int411 = int411;
    }

    public int getInt412() {
        return int412;
    }

    public void setInt412(int int412) {
        this.int412 = int412;
    }

    public int getInt413() {
        return int413;
    }

    public void setInt413(int int413) {
        this.int413 = int413;
    }

    public int getInt414() {
        return int414;
    }

    public void setInt414(int int414) {
        this.int414 = int414;
    }

    public int getInt415() {
        return int415;
    }

    public void setInt415(int int415) {
        this.int415 = int415;
    }

    public int getInt416() {
        return int416;
    }

    public void setInt416(int int416) {
        this.int416 = int416;
    }

    public int getInt417() {
        return int417;
    }

    public void setInt417(int int417) {
        this.int417 = int417;
    }

    public int getInt418() {
        return int418;
    }

    public void setInt418(int int418) {
        this.int418 = int418;
    }

    public int getInt419() {
        return int419;
    }

    public void setInt419(int int419) {
        this.int419 = int419;
    }

    public int getInt420() {
        return int420;
    }

    public void setInt420(int int420) {
        this.int420 = int420;
    }

    public int getInt421() {
        return int421;
    }

    public void setInt421(int int421) {
        this.int421 = int421;
    }

    public int getInt422() {
        return int422;
    }

    public void setInt422(int int422) {
        this.int422 = int422;
    }

    public int getInt423() {
        return int423;
    }

    public void setInt423(int int423) {
        this.int423 = int423;
    }

    public int getInt424() {
        return int424;
    }

    public void setInt424(int int424) {
        this.int424 = int424;
    }

    public int getInt425() {
        return int425;
    }

    public void setInt425(int int425) {
        this.int425 = int425;
    }

    public int getInt426() {
        return int426;
    }

    public void setInt426(int int426) {
        this.int426 = int426;
    }

    public int getInt427() {
        return int427;
    }

    public void setInt427(int int427) {
        this.int427 = int427;
    }

    public int getInt428() {
        return int428;
    }

    public void setInt428(int int428) {
        this.int428 = int428;
    }

    public int getInt429() {
        return int429;
    }

    public void setInt429(int int429) {
        this.int429 = int429;
    }

    public int getInt430() {
        return int430;
    }

    public void setInt430(int int430) {
        this.int430 = int430;
    }

    public int getInt431() {
        return int431;
    }

    public void setInt431(int int431) {
        this.int431 = int431;
    }

    public int getInt432() {
        return int432;
    }

    public void setInt432(int int432) {
        this.int432 = int432;
    }

    public int getInt433() {
        return int433;
    }

    public void setInt433(int int433) {
        this.int433 = int433;
    }

    public int getInt434() {
        return int434;
    }

    public void setInt434(int int434) {
        this.int434 = int434;
    }

    public int getInt435() {
        return int435;
    }

    public void setInt435(int int435) {
        this.int435 = int435;
    }

    public int getInt436() {
        return int436;
    }

    public void setInt436(int int436) {
        this.int436 = int436;
    }

    public int getInt437() {
        return int437;
    }

    public void setInt437(int int437) {
        this.int437 = int437;
    }

    public int getInt438() {
        return int438;
    }

    public void setInt438(int int438) {
        this.int438 = int438;
    }

    public int getInt439() {
        return int439;
    }

    public void setInt439(int int439) {
        this.int439 = int439;
    }

    public int getInt440() {
        return int440;
    }

    public void setInt440(int int440) {
        this.int440 = int440;
    }

    public int getInt441() {
        return int441;
    }

    public void setInt441(int int441) {
        this.int441 = int441;
    }

    public int getInt442() {
        return int442;
    }

    public void setInt442(int int442) {
        this.int442 = int442;
    }

    public int getInt443() {
        return int443;
    }

    public void setInt443(int int443) {
        this.int443 = int443;
    }

    public int getInt444() {
        return int444;
    }

    public void setInt444(int int444) {
        this.int444 = int444;
    }

    public int getInt445() {
        return int445;
    }

    public void setInt445(int int445) {
        this.int445 = int445;
    }

    public int getInt446() {
        return int446;
    }

    public void setInt446(int int446) {
        this.int446 = int446;
    }

    public int getInt447() {
        return int447;
    }

    public void setInt447(int int447) {
        this.int447 = int447;
    }

    public int getInt448() {
        return int448;
    }

    public void setInt448(int int448) {
        this.int448 = int448;
    }

    public int getInt449() {
        return int449;
    }

    public void setInt449(int int449) {
        this.int449 = int449;
    }

    public int getInt450() {
        return int450;
    }

    public void setInt450(int int450) {
        this.int450 = int450;
    }

    public int getInt451() {
        return int451;
    }

    public void setInt451(int int451) {
        this.int451 = int451;
    }

    public int getInt452() {
        return int452;
    }

    public void setInt452(int int452) {
        this.int452 = int452;
    }

    public int getInt453() {
        return int453;
    }

    public void setInt453(int int453) {
        this.int453 = int453;
    }

    public int getInt454() {
        return int454;
    }

    public void setInt454(int int454) {
        this.int454 = int454;
    }

    public int getInt455() {
        return int455;
    }

    public void setInt455(int int455) {
        this.int455 = int455;
    }

    public int getInt456() {
        return int456;
    }

    public void setInt456(int int456) {
        this.int456 = int456;
    }

    public int getInt457() {
        return int457;
    }

    public void setInt457(int int457) {
        this.int457 = int457;
    }

    public int getInt458() {
        return int458;
    }

    public void setInt458(int int458) {
        this.int458 = int458;
    }

    public int getInt459() {
        return int459;
    }

    public void setInt459(int int459) {
        this.int459 = int459;
    }

    public int getInt460() {
        return int460;
    }

    public void setInt460(int int460) {
        this.int460 = int460;
    }

    public int getInt461() {
        return int461;
    }

    public void setInt461(int int461) {
        this.int461 = int461;
    }

    public int getInt462() {
        return int462;
    }

    public void setInt462(int int462) {
        this.int462 = int462;
    }

    public int getInt463() {
        return int463;
    }

    public void setInt463(int int463) {
        this.int463 = int463;
    }

    public int getInt464() {
        return int464;
    }

    public void setInt464(int int464) {
        this.int464 = int464;
    }

    public int getInt465() {
        return int465;
    }

    public void setInt465(int int465) {
        this.int465 = int465;
    }

    public int getInt466() {
        return int466;
    }

    public void setInt466(int int466) {
        this.int466 = int466;
    }

    public int getInt467() {
        return int467;
    }

    public void setInt467(int int467) {
        this.int467 = int467;
    }

    public int getInt468() {
        return int468;
    }

    public void setInt468(int int468) {
        this.int468 = int468;
    }

    public int getInt469() {
        return int469;
    }

    public void setInt469(int int469) {
        this.int469 = int469;
    }

    public int getInt470() {
        return int470;
    }

    public void setInt470(int int470) {
        this.int470 = int470;
    }

    public int getInt471() {
        return int471;
    }

    public void setInt471(int int471) {
        this.int471 = int471;
    }

    public int getInt472() {
        return int472;
    }

    public void setInt472(int int472) {
        this.int472 = int472;
    }

    public int getInt473() {
        return int473;
    }

    public void setInt473(int int473) {
        this.int473 = int473;
    }

    public int getInt474() {
        return int474;
    }

    public void setInt474(int int474) {
        this.int474 = int474;
    }

    public int getInt475() {
        return int475;
    }

    public void setInt475(int int475) {
        this.int475 = int475;
    }

    public int getInt476() {
        return int476;
    }

    public void setInt476(int int476) {
        this.int476 = int476;
    }

    public int getInt477() {
        return int477;
    }

    public void setInt477(int int477) {
        this.int477 = int477;
    }

    public int getInt478() {
        return int478;
    }

    public void setInt478(int int478) {
        this.int478 = int478;
    }

    public int getInt479() {
        return int479;
    }

    public void setInt479(int int479) {
        this.int479 = int479;
    }

    public int getInt480() {
        return int480;
    }

    public void setInt480(int int480) {
        this.int480 = int480;
    }

    public int getInt481() {
        return int481;
    }

    public void setInt481(int int481) {
        this.int481 = int481;
    }

    public int getInt482() {
        return int482;
    }

    public void setInt482(int int482) {
        this.int482 = int482;
    }

    public int getInt483() {
        return int483;
    }

    public void setInt483(int int483) {
        this.int483 = int483;
    }

    public int getInt484() {
        return int484;
    }

    public void setInt484(int int484) {
        this.int484 = int484;
    }

    public int getInt485() {
        return int485;
    }

    public void setInt485(int int485) {
        this.int485 = int485;
    }

    public int getInt486() {
        return int486;
    }

    public void setInt486(int int486) {
        this.int486 = int486;
    }

    public int getInt487() {
        return int487;
    }

    public void setInt487(int int487) {
        this.int487 = int487;
    }

    public int getInt488() {
        return int488;
    }

    public void setInt488(int int488) {
        this.int488 = int488;
    }

    public int getInt489() {
        return int489;
    }

    public void setInt489(int int489) {
        this.int489 = int489;
    }

    public int getInt490() {
        return int490;
    }

    public void setInt490(int int490) {
        this.int490 = int490;
    }

    public int getInt491() {
        return int491;
    }

    public void setInt491(int int491) {
        this.int491 = int491;
    }

    public int getInt492() {
        return int492;
    }

    public void setInt492(int int492) {
        this.int492 = int492;
    }

    public int getInt493() {
        return int493;
    }

    public void setInt493(int int493) {
        this.int493 = int493;
    }

    public int getInt494() {
        return int494;
    }

    public void setInt494(int int494) {
        this.int494 = int494;
    }

    public int getInt495() {
        return int495;
    }

    public void setInt495(int int495) {
        this.int495 = int495;
    }

    public int getInt496() {
        return int496;
    }

    public void setInt496(int int496) {
        this.int496 = int496;
    }

    public int getInt497() {
        return int497;
    }

    public void setInt497(int int497) {
        this.int497 = int497;
    }

    public int getInt498() {
        return int498;
    }

    public void setInt498(int int498) {
        this.int498 = int498;
    }


}
