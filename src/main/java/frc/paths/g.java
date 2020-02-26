package frc.paths;

import com.team319.trajectory.Path;

public class g extends Path {
   // dt,x,y,left.pos,left.vel,left.acc,left.jerk,center.pos,center.vel,center.acc,center.jerk,right.pos,right.vel,right.acc,right.jerk,heading
	private static final double[][] points = {
				{0.0200,37.8474,-0.3590,0.0028,0.1400,7.0000,0.0000,0.0028,0.1400,7.0000,0.0000,0.0028,0.1400,7.0000,0.0000,2.7576},
				{0.0200,37.8422,-0.3569,0.0084,0.2799,6.9965,-0.1753,0.0084,0.2800,7.0000,0.0000,0.0084,0.2801,7.0035,0.1753,2.7576},
				{0.0200,37.8344,-0.3537,0.0168,0.4198,6.9917,-0.2406,0.0168,0.4200,7.0000,0.0000,0.0168,0.4202,7.0083,0.2406,2.7576},
				{0.0200,37.8240,-0.3495,0.0280,0.5594,6.9838,-0.3928,0.0280,0.5600,7.0000,0.0000,0.0280,0.5606,7.0162,0.3928,2.7576},
				{0.0200,37.8111,-0.3443,0.0420,0.6989,6.9734,-0.5220,0.0420,0.7000,7.0000,0.0000,0.0420,0.7011,7.0266,0.5220,2.7577},
				{0.0200,37.7955,-0.3380,0.0587,0.8381,6.9604,-0.6495,0.0588,0.8400,7.0000,0.0000,0.0589,0.8419,7.0396,0.6495,2.7577},
				{0.0200,37.7773,-0.3306,0.0783,0.9770,6.9449,-0.7752,0.0784,0.9800,7.0000,0.0000,0.0785,0.9830,7.0551,0.7752,2.7577},
				{0.0200,37.7565,-0.3222,0.1006,1.1156,6.9269,-0.8985,0.1008,1.1200,7.0000,0.0000,0.1010,1.1244,7.0731,0.8985,2.7578},
				{0.0200,37.7332,-0.3128,0.1256,1.2537,6.9065,-1.0191,0.1260,1.2600,7.0000,0.0000,0.1264,1.2663,7.0935,1.0191,2.7579},
				{0.0200,37.7072,-0.3023,0.1535,1.3914,6.8838,-1.1368,0.1540,1.4000,7.0000,0.0000,0.1545,1.4086,7.1162,1.1368,2.7581},
				{0.0200,37.6786,-0.2908,0.1840,1.5285,6.8588,-1.2510,0.1848,1.5400,7.0000,0.0000,0.1856,1.5515,7.1412,1.2510,2.7583},
				{0.0200,37.6475,-0.2782,0.2173,1.6652,6.8316,-1.3616,0.2184,1.6800,7.0000,0.0000,0.2195,1.6948,7.1684,1.3616,2.7586},
				{0.0200,37.6137,-0.2647,0.2534,1.8012,6.8022,-1.4681,0.2548,1.8200,7.0000,0.0000,0.2562,1.8388,7.1978,1.4681,2.7589},
				{0.0200,37.5773,-0.2500,0.2921,1.9366,6.7708,-1.5703,0.2940,1.9600,7.0000,0.0000,0.2959,1.9834,7.2292,1.5703,2.7593},
				{0.0200,37.5384,-0.2344,0.3335,2.0714,6.7374,-1.6678,0.3360,2.1000,7.0000,0.0000,0.3385,2.1286,7.2626,1.6678,2.7598},
				{0.0200,37.4968,-0.2177,0.3776,2.2054,6.7022,-1.7603,0.3808,2.2400,7.0000,0.0000,0.3840,2.2746,7.2978,1.7603,2.7604},
				{0.0200,37.4526,-0.2000,0.4244,2.3387,6.6653,-1.8475,0.4284,2.3800,7.0000,0.0000,0.4324,2.4213,7.3347,1.8475,2.7612},
				{0.0200,37.4058,-0.1813,0.4738,2.4713,6.6267,-1.9290,0.4788,2.5200,7.0000,0.0000,0.4838,2.5687,7.3733,1.9290,2.7620},
				{0.0200,37.3564,-0.1616,0.5259,2.6030,6.5866,-2.0045,0.5320,2.6600,7.0000,0.0000,0.5381,2.7170,7.4134,2.0045,2.7630},
				{0.0200,37.3043,-0.1409,0.5806,2.7339,6.5451,-2.0736,0.5880,2.8000,7.0000,0.0000,0.5954,2.8661,7.4549,2.0735,2.7642},
				{0.0200,37.2497,-0.1193,0.6379,2.8639,6.5024,-2.1358,0.6468,2.9400,7.0000,0.0000,0.6557,3.0161,7.4976,2.1357,2.7656},
				{0.0200,37.1923,-0.0967,0.6977,2.9931,6.4586,-2.1907,0.7084,3.0800,7.0000,0.0000,0.7191,3.1669,7.5414,2.1907,2.7671},
				{0.0200,37.1324,-0.0732,0.7601,3.1214,6.4138,-2.2379,0.7728,3.2200,7.0000,0.0000,0.7855,3.3186,7.5862,2.2377,2.7689},
				{0.0200,37.0698,-0.0488,0.8251,3.2488,6.3683,-2.2765,0.8400,3.3600,7.0000,0.0000,0.8549,3.4712,7.6317,2.2764,2.7708},
				{0.0200,37.0045,-0.0235,0.8926,3.3752,6.3222,-2.3061,0.9100,3.5000,7.0000,0.0000,0.9274,3.6248,7.6778,2.3059,2.7731},
				{0.0200,36.9366,0.0026,0.9626,3.5007,6.2757,-2.3258,0.9828,3.6400,7.0000,0.0000,1.0030,3.7793,7.7243,2.3256,2.7755},
				{0.0200,36.8659,0.0296,1.0351,3.6253,6.2290,-2.3346,1.0584,3.7800,7.0000,0.0000,1.0817,3.9347,7.7710,2.3344,2.7783},
				{0.0200,36.7926,0.0573,1.1101,3.7489,6.1823,-2.3316,1.1368,3.9200,7.0000,0.0000,1.1635,4.0911,7.8176,2.3313,2.7813},
				{0.0200,36.7166,0.0858,1.1876,3.8717,6.1360,-2.3155,1.2180,4.0600,7.0000,0.0000,1.2484,4.2483,7.8639,2.3152,2.7847},
				{0.0200,36.6378,0.1150,1.2674,3.9935,6.0903,-2.2850,1.3020,4.2000,7.0000,0.0000,1.3366,4.4065,7.9096,2.2846,2.7884},
				{0.0200,36.5563,0.1449,1.3497,4.1144,6.0456,-2.2385,1.3888,4.3400,7.0000,0.0000,1.4279,4.5656,7.9544,2.2381,2.7924},
				{0.0200,36.4721,0.1754,1.4344,4.2344,6.0021,-2.1742,1.4784,4.4800,7.0000,0.0000,1.5224,4.7256,7.9979,2.1738,2.7967},
				{0.0200,36.3850,0.2064,1.5215,4.3536,5.9603,-2.0903,1.5708,4.6200,7.0000,0.0000,1.6201,4.8864,8.0397,2.0898,2.8015},
				{0.0200,36.2952,0.2379,1.6109,4.4720,5.9206,-1.9845,1.6660,4.7600,7.0000,0.0000,1.7211,5.0480,8.0793,1.9839,2.8066},
				{0.0200,36.2026,0.2699,1.7027,4.5897,5.8835,-1.8545,1.7640,4.9000,7.0000,0.0000,1.8253,5.2103,8.1164,1.8539,2.8121},
				{0.0200,36.1071,0.3022,1.7968,4.7067,5.8495,-1.6978,1.8648,5.0400,7.0000,0.0000,1.9328,5.3733,8.1503,1.6971,2.8180},
				{0.0200,36.0088,0.3349,1.8933,4.8231,5.8193,-1.5116,1.9684,5.1800,7.0000,0.0000,2.0435,5.5369,8.1806,1.5108,2.8244},
				{0.0200,35.9076,0.3677,1.9921,4.9390,5.7934,-1.2931,2.0748,5.3200,7.0000,0.0000,2.1575,5.7010,8.2064,1.2923,2.8311},
				{0.0200,35.8035,0.4007,2.0932,5.0544,5.7727,-1.0394,2.1840,5.4600,7.0000,0.0000,2.2748,5.8656,8.2272,1.0386,2.8384},
				{0.0200,35.6964,0.4337,2.1966,5.1696,5.7577,-0.7477,2.2960,5.6000,7.0000,0.0000,2.3954,6.0304,8.2421,0.7468,2.8460},
				{0.0200,35.5865,0.4667,2.3023,5.2845,5.7494,-0.4151,2.4108,5.7400,7.0000,0.0000,2.5193,6.1954,8.2504,0.4142,2.8541},
				{0.0200,35.4736,0.4996,2.4102,5.3995,5.7486,-0.0391,2.5284,5.8800,7.0000,0.0000,2.6465,6.3604,8.2512,0.0382,2.8626},
				{0.0200,35.3577,0.5322,2.5205,5.5146,5.7563,0.3827,2.6488,6.0200,7.0000,0.0000,2.7771,6.5253,8.2435,-0.3835,2.8716},
				{0.0200,35.2388,0.5645,2.6331,5.6301,5.7733,0.8520,2.7720,6.1600,7.0000,0.0000,2.9109,6.6898,8.2264,-0.8528,2.8810},
				{0.0200,35.1169,0.5964,2.7481,5.7461,5.8007,1.3699,2.8980,6.3000,7.0000,0.0000,3.0479,6.8538,8.1990,-1.3706,2.8909},
				{0.0200,34.9919,0.6277,2.8653,5.8629,5.8394,1.9369,3.0268,6.4400,7.0000,0.0000,3.1883,7.0170,8.1603,-1.9375,2.9012},
				{0.0200,34.8640,0.6584,2.9849,5.9807,5.8905,2.5525,3.1584,6.5800,7.0000,0.0000,3.3319,7.1792,8.1092,-2.5529,2.9118},
				{0.0200,34.7329,0.6883,3.1069,6.0998,5.9548,3.2148,3.2928,6.7200,7.0000,0.0000,3.4787,7.3401,8.0449,-3.2150,2.9228},
				{0.0200,34.5988,0.7173,3.2313,6.2205,6.0332,3.9212,3.4300,6.8600,7.0000,0.0000,3.6286,7.4994,7.9665,-3.9212,2.9342},
				{0.0200,34.4617,0.7453,3.3582,6.3430,6.1266,4.6677,3.5700,7.0000,7.0000,0.0000,3.7818,7.6569,7.8731,-4.6673,2.9459},
				{0.0200,34.3269,0.7712,3.4825,6.2141,-6.4456,-628.6100,3.7072,6.8600,-7.0000,0.0000,3.9319,7.5058,-7.5542,-771.3653,2.9574},
				{0.0200,34.1947,0.7951,3.6042,6.0875,-6.3296,5.8029,3.8416,6.7200,-7.0000,0.0000,4.0789,7.3524,-7.6702,-5.8020,2.9686},
				{0.0200,34.0649,0.8170,3.7235,5.9630,-6.2262,5.1703,3.9732,6.5800,-7.0000,0.0000,4.2229,7.1969,-7.7736,-5.1697,2.9796},
				{0.0200,33.9377,0.8371,3.8403,5.8403,-6.1353,4.5431,4.1020,6.4400,-7.0000,0.0000,4.3637,7.0397,-7.8644,-4.5427,2.9902},
				{0.0200,33.8130,0.8555,3.9547,5.7191,-6.0567,3.9279,4.2280,6.3000,-7.0000,0.0000,4.5013,6.8808,-7.9430,-3.9277,3.0006},
				{0.0200,33.6910,0.8722,4.0667,5.5993,-5.9901,3.3307,4.3512,6.1600,-7.0000,0.0000,4.6357,6.7206,-8.0096,-3.3308,3.0105},
				{0.0200,33.5715,0.8873,4.1763,5.4806,-5.9350,2.7566,4.4716,6.0200,-7.0000,0.0000,4.7669,6.5593,-8.0648,-2.7569,3.0201},
				{0.0200,33.4547,0.9011,4.2835,5.3628,-5.8908,2.2100,4.5892,5.8800,-7.0000,0.0000,4.8948,6.3971,-8.1090,-2.2105,3.0293},
				{0.0200,33.3406,0.9134,4.3885,5.2457,-5.8569,1.6941,4.7040,5.7400,-7.0000,0.0000,5.0195,6.2343,-8.1429,-1.6947,3.0381},
				{0.0200,33.2292,0.9245,4.4910,5.1290,-5.8327,1.2113,4.8160,5.6000,-7.0000,0.0000,5.1409,6.0709,-8.1671,-1.2120,3.0465},
				{0.0200,33.1204,0.9345,4.5913,5.0127,-5.8174,0.7631,4.9252,5.4600,-7.0000,0.0000,5.2591,5.9073,-8.1824,-0.7638,3.0544},
				{0.0200,33.0144,0.9433,4.6892,4.8965,-5.8104,0.3502,5.0316,5.3200,-7.0000,0.0000,5.3740,5.7435,-8.1894,-0.3510,3.0620},
				{0.0200,32.9111,0.9512,4.7848,4.7803,-5.8110,-0.0273,5.1352,5.1800,-7.0000,0.0000,5.4856,5.5797,-8.1889,0.0266,3.0691},
				{0.0200,32.8105,0.9582,4.8781,4.6639,-5.8184,-0.3700,5.2360,5.0400,-7.0000,0.0000,5.5939,5.4161,-8.1815,0.3692,3.0757},
				{0.0200,32.7127,0.9643,4.9690,4.5472,-5.8320,-0.6788,5.3340,4.9000,-7.0000,0.0000,5.6989,5.2527,-8.1679,0.6780,3.0820},
				{0.0200,32.6177,0.9697,5.0576,4.4302,-5.8511,-0.9550,5.4292,4.7600,-7.0000,0.0000,5.8007,5.0898,-8.1488,0.9543,3.0879},
				{0.0200,32.5254,0.9744,5.1439,4.3127,-5.8751,-1.2003,5.5216,4.6200,-7.0000,0.0000,5.8993,4.9273,-8.1248,1.1996,3.0933},
				{0.0200,32.4359,0.9785,5.2278,4.1947,-5.9034,-1.4162,5.6112,4.4800,-7.0000,0.0000,5.9946,4.7653,-8.0965,1.4156,3.0984},
				{0.0200,32.3492,0.9820,5.3093,4.0760,-5.9355,-1.6047,5.6980,4.3400,-7.0000,0.0000,6.0867,4.6040,-8.0644,1.6041,3.1031},
				{0.0200,32.2652,0.9851,5.3884,3.9565,-5.9708,-1.7675,5.7820,4.2000,-7.0000,0.0000,6.1755,4.4435,-8.0291,1.7669,3.1074},
				{0.0200,32.1841,0.9877,5.4652,3.8364,-6.0090,-1.9063,5.8632,4.0600,-7.0000,0.0000,6.2612,4.2836,-7.9910,1.9058,3.1114},
				{0.0200,32.1057,0.9899,5.5395,3.7154,-6.0494,-2.0229,5.9416,3.9200,-7.0000,0.0000,6.3437,4.1246,-7.9505,2.0224,3.1150},
				{0.0200,32.0301,0.9918,5.6114,3.5935,-6.0918,-2.1189,6.0172,3.7800,-7.0000,0.0000,6.4230,3.9665,-7.9082,2.1185,3.1184},
				{0.0200,31.9573,0.9934,5.6808,3.4708,-6.1357,-2.1957,6.0900,3.6400,-7.0000,0.0000,6.4992,3.8092,-7.8643,2.1954,3.1214},
				{0.0200,31.8873,0.9947,5.7477,3.3472,-6.1808,-2.2547,6.1600,3.5000,-7.0000,0.0000,6.5723,3.6528,-7.8192,2.2544,3.1241},
				{0.0200,31.8202,0.9958,5.8122,3.2227,-6.2267,-2.2972,6.2272,3.3600,-7.0000,0.0000,6.6422,3.4973,-7.7732,2.2969,3.1265},
				{0.0200,31.7558,0.9967,5.8741,3.0972,-6.2732,-2.3241,6.2916,3.2200,-7.0000,0.0000,6.7091,3.3428,-7.7268,2.3239,3.1287},
				{0.0200,31.6942,0.9974,5.9335,2.9708,-6.3200,-2.3366,6.3532,3.0800,-7.0000,0.0000,6.7728,3.1892,-7.6800,2.3364,3.1307},
				{0.0200,31.6354,0.9980,5.9904,2.8435,-6.3667,-2.3353,6.4120,2.9400,-7.0000,0.0000,6.8336,3.0365,-7.6333,2.3352,3.1324},
				{0.0200,31.5794,0.9985,6.0447,2.7152,-6.4131,-2.3212,6.4680,2.8000,-7.0000,0.0000,6.8913,2.8848,-7.5869,2.3210,3.1339},
				{0.0200,31.5262,0.9989,6.0964,2.5860,-6.4590,-2.2948,6.5212,2.6600,-7.0000,0.0000,6.9460,2.7340,-7.5410,2.2947,3.1352},
				{0.0200,31.4758,0.9992,6.1455,2.4559,-6.5041,-2.2568,6.5716,2.5200,-7.0000,0.0000,6.9976,2.5841,-7.4959,2.2567,3.1363},
				{0.0200,31.4282,0.9994,6.1920,2.3250,-6.5483,-2.2078,6.6192,2.3800,-7.0000,0.0000,7.0463,2.4350,-7.4517,2.2077,3.1373},
				{0.0200,31.3834,0.9996,6.2359,2.1932,-6.5912,-2.1481,6.6640,2.2400,-7.0000,0.0000,7.0921,2.2868,-7.4088,2.1481,3.1381},
				{0.0200,31.3414,0.9997,6.2771,2.0605,-6.6328,-2.0784,6.7060,2.1000,-7.0000,0.0000,7.1349,2.1395,-7.3672,2.0784,3.1388},
				{0.0200,31.3022,0.9998,6.3157,1.9270,-6.6728,-1.9990,6.7452,1.9600,-7.0000,0.0000,7.1747,1.9930,-7.3272,1.9990,3.1394},
				{0.0200,31.2658,0.9999,6.3515,1.7928,-6.7110,-1.9105,6.7816,1.8200,-7.0000,0.0000,7.2117,1.8472,-7.2890,1.9105,3.1399},
				{0.0200,31.2322,0.9999,6.3847,1.6579,-6.7473,-1.8132,6.8152,1.6800,-7.0000,0.0000,7.2457,1.7021,-7.2527,1.8132,3.1403},
				{0.0200,31.2014,0.9999,6.4151,1.5223,-6.7814,-1.7077,6.8460,1.5400,-7.0000,0.0000,7.2769,1.5577,-7.2186,1.7077,3.1406},
				{0.0200,31.1734,1.0000,6.4428,1.3860,-6.8133,-1.5944,6.8740,1.4000,-7.0000,0.0000,7.3051,1.4140,-7.1867,1.5944,3.1409},
				{0.0200,31.1482,1.0000,6.4678,1.2491,-6.8428,-1.4739,6.8992,1.2600,-7.0000,0.0000,7.3306,1.2709,-7.1572,1.4739,3.1411},
				{0.0200,31.1258,1.0000,6.4900,1.1117,-6.8697,-1.3466,6.9216,1.1200,-7.0000,0.0000,7.3531,1.1283,-7.1303,1.3466,3.1412},
				{0.0200,31.1062,1.0000,6.5095,0.9739,-6.8940,-1.2131,6.9412,0.9800,-7.0000,0.0000,7.3728,0.9861,-7.1060,1.2131,3.1413},
				{0.0200,31.0894,1.0000,6.5262,0.8355,-6.9155,-1.0741,6.9580,0.8400,-7.0000,0.0000,7.3897,0.8445,-7.0845,1.0741,3.1414},
				{0.0200,31.0754,1.0000,6.5402,0.6969,-6.9341,-0.9301,6.9720,0.7000,-7.0000,0.0000,7.4038,0.7031,-7.0659,0.9301,3.1415},
				{0.0200,31.0642,1.0000,6.5513,0.5579,-6.9497,-0.7818,6.9832,0.5600,-7.0000,0.0000,7.4150,0.5621,-7.0503,0.7818,3.1415},
				{0.0200,31.0558,1.0000,6.5597,0.4186,-6.9623,-0.6298,6.9916,0.4200,-7.0000,0.0000,7.4235,0.4214,-7.0377,0.6298,3.1415},
				{0.0200,31.0502,1.0000,6.5653,0.2792,-6.9718,-0.4750,6.9972,0.2800,-7.0000,0.0000,7.4291,0.2808,-7.0282,0.4750,3.1415},
				{0.0200,31.0474,1.0000,6.5681,0.1396,-6.9781,-0.3179,7.0000,0.1400,-7.0000,0.0000,7.4319,0.1404,-7.0219,0.3179,3.1415},
				{0.0200,31.0474,1.0000,6.5681,0.0000,-6.9813,-0.1593,7.0000,-0.0000,-7.0000,0.0000,7.4319,0.0000,-7.0187,0.1593,3.1415},

	    };

	@Override
	public double[][] getPath() {
	    return points;
	}
}