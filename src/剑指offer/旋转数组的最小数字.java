package 剑指offer;

public class 旋转数组的最小数字 {
    public static int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1]) {
                return array[i];
            }
        }
        return array[array.length - 1];
    }

    public static void main(String[] args) {
        int[] b = {4950,4950,4952,4954,4955,4956,4956,4957,4957,4958,4959,4959,4960,4961,4962,4962,4963,4963,4963,4965,4967,4967,4967,4969,4970,4971,4971,4973,4976,4978,4979,4979,4980,4980,4982,4983,4984,4985,4986,4986,4987,4988,4988,4989,4989,4989,4990,4991,4993,4993,4997,4999,4999,5000,5000,5001,5001,5003,5005,5006,5006,5007,5007,5010,5012,5013,5013,5013,5014,5014,5016,5021,5021,5022,5022,5023,5023,5024,5024,5025,5027,5027,5028,5029,5031,5031,5033,5033,5033,5033,5034,5034,5038,5039,5039,5042,5043,5044,5045,5046,5050,5051,5053,5054,5056,5056,5059,5059,5060,5062,5062,5063,5064,5066,5070,5072,5073,5073,5076,5076,5079,5080,5082,5083,5085,5085,5085,5087,5088,5090,5090,5090,5091,5094,5095,5095,5096,5098,5099,5101,5105,5106,5108,5109,5110,5112,5118,5118,5122,5124,5128,5129,5129,5129,5132,5133,5135,5136,5137,5138,5138,5138,5138,5141,5142,5145,5146,5146,5148,5150,5150,5153,5155,5159,5159,5162,5163,5163,5166,5168,5168,5170,5170,5172,5175,5175,5176,5176,5178,5184,5184,5185,5186,5189,5190,5191,5191,5191,5192,5192,5192,5194,5198,5200,5200,5200,5201,5203,5205,5206,5206,5216,5220,5221,5222,5225,5226,5226,5227,5228,5231,5231,5231,5234,5234,5235,5237,5239,5239,5242,5243,5247,5247,5249,5250,5250,5252,5254,5254,5254,5255,5256,5256,5258,5258,5259,5260,5261,5263,5265,5265,5265,5265,5267,5269,5270,5270,5270,5272,5274,5276,5280,5280,5282,5282,5283,5284,5285,5287,5290,5291,5291,5291,5291,5293,5294,5294,5297,5297,5300,5301,5303,5304,5305,5307,5312,5313,5314,5315,5316,5317,5317,5317,5319,5319,5320,5320,5322,5329,5330,5332,5334,5334,5339,5341,5343,5344,5344,5345,5346,5346,5347,5347,5348,5348,5350,5351,5352,5353,5353,5359,5359,5362,5368,5370,5370,5371,5371,5371,5372,5375,5377,5378,5385,5385,5386,5386,5387,5388,5389,5390,5392,5392,5396,5397,5399,5399,5403,5403,5404,5405,5407,5408,5409,5412,5412,5413,5413,5415,5416,5417,5417,5417,5418,5419,5420,5423,5424,5424,5428,5429,5430,5432,5434,5434,5435,5437,5437,5442,5443,5445,5447,5448,5448,5450,5451,5451,5453,5453,5453,5455,5455,5456,5457,5457,5458,5461,5464,5466,5470,5470,5471,5472,5473,5473,5477,5478,5485,5486,5489,5492,5493,5495,5496,5499,5503,5504,5506,5507,5508,5509,5514,5517,5518,5519,5520,5520,5521,5525,5526,5530,5530,5531,5533,5533,5533,5536,5536,5537,5537,5538,5538,5539,5541,5542,5543,5546,5548,5548,5548,5548,5548,5554,5556,5557,5559,5561,5561,5562,5562,5562,5564,5566,5566,5566,5566,5567,5567,5568,5569,5574,5574,5575,5576,5580,5582,5585,5585,5585,5588,5590,5590,5590,5590,5590,5591,5595,5597,5598,5599,5600,5602,5602,5603,5603,5604,5604,5606,5607,5607,5607,5609,5611,5611,5611,5616,5616,5617,5619,5620,5621,5621,5622,5624,5625,5626,5628,5629,5630,5630,5630,5632,5632,5633,5634,5636,5637,5639,5639,5640,5644,5646,5647,5647,5649,5652,5652,5652,5654,5657,5657,5663,5666,5666,5669,5669,5674,5675,5675,5676,5676,5677,5677,5678,5678,5679,5679,5680,5680,5681,5687,5687,5690,5691,5693,5695,5696,5698,5700,5706,5706,5707,5707,5707,5710,5711,5713,5713,5714,5714,5715,5716,5717,5718,5719,5722,5723,5723,5723,5723,5726,5727,5727,5729,5730,5730,5733,5734,5735,5740,5740,5742,5746,5746,5749,5750,5751,5751,5753,5755,5757,5757,5759,5759,5760,5760,5761,5761,5761,5761,5761,5765,5766,5766,5768,5770,5771,5772,5775,5776,5777,5779,5782,5784,5784,5784,5786,5787,5788,5789,5791,5791,5791,5792,5792,5792,5792,5793,5794,5794,5795,5795,5798,5801,5803,5803,5808,5809,5809,5810,5812,5813,5813,5813,5814,5814,5815,5816,5817,5819,5821,5822,5822,5822,5823,5823,5825,5825,5827,5828,5829,5829,5830,5832,5834,5835,5835,5836,5837,5837,5837,5839,5842,5842,5843,5843,5845,5845,5846,5847,5847,5848,5849,5851,5852,5852,5852,5853,5855,5858,5858,5859,5860,5863,5864,5865,5866,5866,5868,5870,5870,5872,5873,5875,5875,5875,5875,5877,5881,5882,5882,5886,5891,5892,5894,5894,5897,5897,5898,5899,5904,5906,5907,5908,5908,5913,5916,5918,5921,5924,5924,5925,5928,5928,5929,5929,5935,5937,5937,5938,5939,5940,5940,5941,5942,5942,5944,5945,5946,5946,5946,5947,5948,5949,5949,5951,5952,5956,5957,5961,5967,5967,5968,5968,5968,5970,5971,5971,5974,5975,5975,5981,5982,5985,5986,5988,5988,5988,5989,5991,5992,5994,5995,5995,5997,5998,6002,6003,6004,6004,6007,6009,6010,6017,6018,6019,6021,6022,6022,6024,6026,6029,6031,6031,6032,6032,6033,6035,6037,6039,6039,6039,6039,6041,6041,6041,6047,6049,6049,6051,6052,6053,6053,6054,6054,6059,6060,6061,6062,6064,6065,6065,6066,6068,6069,6071,6071,6072,6073,6073,6075,6075,6078,6081,6082,6086,6086,6086,6089,6090,6091,6097,6098,6098,6100,6100,6100,6100,6101,6101,6101,6102,6103,6104,6106,6108,6113,6114,6115,6115,6116,6116,6117,6118,6119,6119,6120,6121,6123,6123,6125,6126,6126,6126,6127,6127,6127,6129,6130,6130,6130,6134,6135,6136,6140,6140,6140,6141,6142,6142,6142,6142,6143,6146,6147,6150,6150,6153,6154,6154,6155,6158,6159,6161,6162,6163,6164,6168,6171,6173,6174,6177,6178,6183,6189,6191,6192,6192,6194,6194,6195,6198,6200,6201,6202,6203,6203,6204,6205,6205,6205,6207,6207,6209,6210,6210,6212,6216,6217,6218,6219,6220,6223,6223,6225,6225,6225,6226,6227,6227,6228,6232,6232,6232,6235,6236,6238,6239,6239,6242,6249,6250,6251,6252,6254,6256,6257,6258,6258,6260,6260,6261,6261,6261,6265,6267,6267,6269,6271,6272,6273,6273,6275,6279,6280,6281,6282,6282,6283,6283,6287,6288,6288,6291,6292,6293,6293,6293,6297,6301,6301,6303,6304,6304,6306,6309,6313,6318,6321,6321,6322,6322,6322,6328,6328,6330,6332,6333,6334,6334,6335,6337,6337,6337,6338,6339,6340,6340,6341,6342,6344,6344,6345,6345,6346,6346,6347,6350,6351,6355,6359,6359,6360,6360,6361,6363,6364,6364,6365,6366,6367,6367,6367,6368,6370,6372,6380,6383,6386,6386,6387,6389,6393,6394,6395,6396,6396,6397,6399,6406,6407,6408,6411,6412,6413,6414,6414,6419,6420,6422,6422,6423,6423,6424,6424,6425,6425,6426,6427,6428,6429,6430,6430,6431,6431,6431,6432,6432,6435,6435,6437,6440,6440,6440,6440,6440,6442,6444,6445,6447,6447,6449,6451,6451,6454,6459,6460,6460,6461,6462,6462,6464,6464,6464,6465,6465,6467,6468,6468,6468,6468,6468,6469,6470,6474,6475,6478,6478,6478,6479,6480,6484,6485,6487,6489,6490,6490,6491,6492,6494,6498,6499,6500,6501,6501,6503,6503,6505,6505,6509,6509,6510,6512,6513,6514,6518,6519,6520,6520,6526,6529,6534,6534,6535,6535,6539,6539,6540,6541,6541,6542,6542,6543,6545,6550,6550,6550,6550,6551,6553,6556,6558,6559,6560,6562,6562,6563,6566,6566,6566,6570,6573,6574,6576,6576,6577,6577,6577,6579,6583,6583,6584,6585,6585,6587,6587,6587,6587,6588,6589,6590,6590,6591,6592,6595,6596,6596,6600,6601,6603,6603,6606,6609,6611,6611,6612,6612,6613,6613,6616,6616,6617,6618,6619,6622,6624,6625,6625,6627,6627,6631,6632,6633,6633,6634,6634,6635,6635,6636,6637,6638,6638,6641,6642,6642,6642,6646,6646,6647,6648,6649,6650,6652,6653,6654,6654,6655,6658,6659,6659,6665,6667,6668,6668,6668,6672,6674,6676,6677,6678,6679,6680,6684,6686,6688,6689,6694,6694,6698,6699,6701,6702,6702,6703,6705,6705,6706,6706,6706,6709,6711,6714,6715,6716,6717,6718,6721,6722,6724,6725,6728,6728,6728,6730,6732,6732,6732,6735,6736,6738,6739,6741,6742,6742,6743,6743,6747,6748,6749,6749,6754,6755,6755,6756,6759,6759,6761,6763,6764,6767,6767,6767,6768,6768,6770,6778,6782,6782,6782,6783,6783,6785,6785,6788,6791,6793,6793,6794,6795,6799,6799,6799,6804,6805,6807,6807,6807,6808,6808,6809,6810,6812,6812,6812,6814,6815,6815,6817,6817,6817,6818,6820,6822,6824,6825,6825,6825,6826,6827,6829,6831,6832,6834,68};
        int[] a = {4950,4950,4952,4954,4955,4956,4956,4957,4957,4958,4959,4959,4960,4961,4962,4962,4963,4963,4963,4965,4967,4967,4967,4969,4970,4971,4971,4973,4976,4978,4979,4979,4980,4980,4982,4983,4984,4985,4986,4986,4987,4988,4988,4989,4989,4989,4990,4991,4993,4993,4997,4999,4999,5000,5000,5001,5001,5003,5005,5006,5006,5007,5007,5010,5012,5013,5013,5013,5014,5014,5016,5021,5021,5022,5022,5023,5023,5024,5024,5025,5027,5027,5028,5029,5031,5031,5033,5033,5033,5033,5034,5034,5038,5039,5039,5042,5043,5044,5045,5046,5050,5051,5053,5054,5056,5056,5059,5059,5060,5062,5062,5063,5064,5066,5070,5072,5073,5073,5076,5076,5079,5080,5082,5083,5085,5085,5085,5087,5088,5090,5090,5090,5091,5094,5095,5095,5096,5098,5099,5101,5105,5106,5108,5109,5110,5112,5118,5118,5122,5124,5128,5129,5129,5129,5132,5133,5135,5136,5137,5138,5138,5138,5138,5141,5142,5145,5146,5146,5148,5150,5150,5153,5155,5159,5159,5162,5163,5163,5166,5168,5168,5170,5170,5172,5175,5175,5176,5176,5178,5184,5184,5185,5186,5189,5190,5191,5191,5191,5192,5192,5192,5194,5198,5200,5200,5200,5201,5203,5205,5206,5206,5216,5220,5221,5222,5225,5226,5226,5227,5228,5231,5231,5231,5234,5234,5235,5237,5239,5239,5242,5243,5247,5247,5249,5250,5250,5252,5254,5254,5254,5255,5256,5256,5258,5258,5259,5260,5261,5263,5265,5265,5265,5265,5267,5269,5270,5270,5270,5272,5274,5276,5280,5280,5282,5282,5283,5284,5285,5287,5290,5291,5291,5291,5291,5293,5294,5294,5297,5297,5300,5301,5303,5304,5305,5307,5312,5313,5314,5315,5316,5317,5317,5317,5319,5319,5320,5320,5322,5329,5330,5332,5334,5334,5339,5341,5343,5344,5344,5345,5346,5346,5347,5347,5348,5348,5350,5351,5352,5353,5353,5359,5359,5362,5368,5370,5370,5371,5371,5371,5372,5375,5377,5378,5385,5385,5386,5386,5387,5388,5389,5390,5392,5392,5396,5397,5399,5399,5403,5403,5404,5405,5407,5408,5409,5412,5412,5413,5413,5415,5416,5417,5417,5417,5418,5419,5420,5423,5424,5424,5428,5429,5430,5432,5434,5434,5435,5437,5437,5442,5443,5445,5447,5448,5448,5450,5451,5451,5453,5453,5453,5455,5455,5456,5457,5457,5458,5461,5464,5466,5470,5470,5471,5472,5473,5473,5477,5478,5485,5486,5489,5492,5493,5495,5496,5499,5503,5504,5506,5507,5508,5509,5514,5517,5518,5519,5520,5520,5521,5525,5526,5530,5530,5531,5533,5533,5533,5536,5536,5537,5537,5538,5538,5539,5541,5542,5543,5546,5548,5548,5548,5548,5548,5554,5556,5557,5559,5561,5561,5562,5562,5562,5564,5566,5566,5566,5566,5567,5567,5568,5569,5574,5574,5575,5576,5580,5582,5585,5585,5585,5588,5590,5590,5590,5590,5590,5591,5595,5597,5598,5599,5600,5602,5602,5603,5603,5604,5604,5606,5607,5607,5607,5609,5611,5611,5611,5616,5616,5617,5619,5620,5621,5621,5622,5624,5625,5626,5628,5629,5630,5630,5630,5632,5632,5633,5634,5636,5637,5639,5639,5640,5644,5646,5647,5647,5649,5652,5652,5652,5654,5657,5657,5663,5666,5666,5669,5669,5674,5675,5675,5676,5676,5677,5677,5678,5678,5679,5679,5680,5680,5681,5687,5687,5690,5691,5693,5695,5696,5698,5700,5706,5706,5707,5707,5707,5710,5711,5713,5713,5714,5714,5715,5716,5717,5718,5719,5722,5723,5723,5723,5723,5726,5727,5727,5729,5730,5730,5733,5734,5735,5740,5740,5742,5746,5746,5749,5750,5751,5751,5753,5755,5757,5757,5759,5759,5760,5760,5761,5761,5761,5761,5761,5765,5766,5766,5768,5770,5771,5772,5775,5776,5777,5779,5782,5784,5784,5784,5786,5787,5788,5789,5791,5791,5791,5792,5792,5792,5792,5793,5794,5794,5795,5795,5798,5801,5803,5803,5808,5809,5809,5810,5812,5813,5813,5813,5814,5814,5815,5816,5817,5819,5821,5822,5822,5822,5823,5823,5825,5825,5827,5828,5829,5829,5830,5832,5834,5835,5835,5836,5837,5837,5837,5839,5842,5842,5843,5843,5845,5845,5846,5847,5847,5848,5849,5851,5852,5852,5852,5853,5855,5858,5858,5859,5860,5863,5864,5865,5866,5866,5868,5870,5870,5872,5873,5875,5875,5875,5875,5877,5881,5882,5882,5886,5891,5892,5894,5894,5897,5897,5898,5899,5904,5906,5907,5908,5908,5913,5916,5918,5921,5924,5924,5925,5928,5928,5929,5929,5935,5937,5937,5938,5939,5940,5940,5941,5942,5942,5944,5945,5946,5946,5946,5947,5948,5949,5949,5951,5952,5956,5957,5961,5967,5967,5968,5968,5968,5970,5971,5971,5974,5975,5975,5981,5982,5985,5986,5988,5988,5988,5989,5991,5992,5994,5995,5995,5997,5998,6002,6003,6004,6004,6007,6009,6010,6017,6018,6019,6021,6022,6022,6024,6026,6029,6031,6031,6032,6032,6033,6035,6037,6039,6039,6039,6039,6041,6041,6041,6047,6049,6049,6051,6052,6053,6053,6054,6054,6059,6060,6061,6062,6064,6065,6065,6066,6068,6069,6071,6071,6072,6073,6073,6075,6075,6078,6081,6082,6086,6086,6086,6089,6090,6091,6097,6098,6098,6100,6100,6100,6100,6101,6101,6101,6102,6103,6104,6106,6108,6113,6114,6115,6115,6116,6116,6117,6118,6119,6119,6120,6121,6123,6123,6125,6126,6126,6126,6127,6127,6127,6129,6130,6130,6130,6134,6135,6136,6140,6140,6140,6141,6142,6142,6142,6142,6143,6146,6147,6150,6150,6153,6154,6154,6155,6158,6159,6161,6162,6163,6164,6168,6171,6173,6174,6177,6178,6183,6189,6191,6192,6192,6194,6194,6195,6198,6200,6201,6202,6203,6203,6204,6205,6205,6205,6207,6207,6209,6210,6210,6212,6216,6217,6218,6219,6220,6223,6223,6225,6225,6225,6226,6227,6227,6228,6232,6232,6232,6235,6236,6238,6239,6239,6242,6249,6250,6251,6252,6254,6256,6257,6258,6258,6260,6260,6261,6261,6261,6265,6267,6267,6269,6271,6272,6273,6273,6275,6279,6280,6281,6282,6282,6283,6283,6287,6288,6288,6291,6292,6293,6293,6293,6297,6301,6301,6303,6304,6304,6306,6309,6313,6318,6321,6321,6322,6322,6322,6328,6328,6330,6332,6333,6334,6334,6335,6337,6337,6337,6338,6339,6340,6340,6341,6342,6344,6344,6345,6345,6346,6346,6347,6350,6351,6355,6359,6359,6360,6360,6361,6363,6364,6364,6365,6366,6367,6367,6367,6368,6370,6372,6380,6383,6386,6386,6387,6389,6393,6394,6395,6396,6396,6397,6399,6406,6407,6408,6411,6412,6413,6414,6414,6419,6420,6422,6422,6423,6423,6424,6424,6425,6425,6426,6427,6428,6429,6430,6430,6431,6431,6431,6432,6432,6435,6435,6437,6440,6440,6440,6440,6440,6442,6444,6445,6447,6447,6449,6451,6451,6454,6459,6460,6460,6461,6462,6462,6464,6464,6464,6465,6465,6467,6468,6468,6468,6468,6468,6469,6470,6474,6475,6478,6478,6478,6479,6480,6484,6485,6487,6489,6490,6490,6491,6492,6494,6498,6499,6500,6501,6501,6503,6503,6505,6505,6509,6509,6510,6512,6513,6514,6518,6519,6520,6520,6526,6529,6534,6534,6535,6535,6539,6539,6540,6541,6541,6542,6542,6543,6545,6550,6550,6550,6550,6551,6553,6556,6558,6559,6560,6562,6562,6563,6566,6566,6566,6570,6573,6574,6576,6576,6577,6577,6577,6579,6583,6583,6584,6585,6585,6587,6587,6587,6587,6588,6589,6590,6590,6591,6592,6595,6596,6596,6600,6601,6603,6603,6606,6609,6611,6611,6612,6612,6613,6613,6616,6616,6617,6618,6619,6622,6624,6625,6625,6627,6627,6631,6632,6633,6633,6634,6634,6635,6635,6636,6637,6638,6638,6641,6642,6642,6642,6646,6646,6647,6648,6649,6650,6652,6653,6654,6654,6655,6658,6659,6659,6665,6667,6668,6668,6668,6672,6674,6676,6677,6678,6679,6680,6684,6686,6688,6689,6694,6694,6698,6699,6701,6702,6702,6703,6705,6705,6706,6706,6706,6709,6711,6714,6715,6716,6717,6718,6721,6722,6724,6725,6728,6728,6728,6730,6732,6732,6732,6735,6736,6738,6739,6741,6742,6742,6743,6743,6747,6748,6749,6749,6754,6755,6755,6756,6759,6759,6761,6763,6764,6767,6767,6767,6768,6768,6770,6778,6782,6782,6782,6783,6783,6785,6785,6788,6791,6793,6793,6794,6795,6799,6799,6799,6804,6805,6807,6807,6807,6808,6808,6809,6810,6812,6812,6812,6814,6815,6815,6817,6817,6817,6818,6820,6822,6824,6825,6825,6825,6826,6827,6829,6831,6832,6834,68};
        System.out.println(minNumberInRotateArray(b));
    }
}
