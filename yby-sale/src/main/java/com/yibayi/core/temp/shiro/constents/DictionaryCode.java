package com.yibayi.core.temp.shiro.constents;

/**
 * 数据字典编码常量类
 */
public interface DictionaryCode {

	/**
	 * 国家
	 */
	public static class COUNTRY {

		/**
		 * 中国
		 */
		public static final String CHINA = "CHINA";

		/**
		 * 泰国
		 */
		public static final String THAILAND = "THAILAND";

		/**
		 * 英国
		 */
		public static final String ENGLAND = "UNITEDKINGDOM";

		/**
		 * 马来西亚
		 */
		public static final String MALAYSIA = "MALAYSIA";

		/**
		 * 其它
		 */
		public static final String OTHER = "OTHER";
	}

	/**
	 * 国家
	 */
	public static class COUNTRY_SORT {

		/**
		 * 中国
		 */
		public static final String CN = "CN";

		/**
		 * 泰国
		 */
		public static final String TH = "TH";
	}

	/**
	 * 中国地区数据缓存
	 */
	public static class CN_AREA {

		/**
		 * 全部数据
		 */
		public static final String ALL = "CN_AREA_ALL";

		/**
		 * 省份
		 */
		public static final String PROVINCE = "CN_AREA_PROVINCE";

		/**
		 * 城市
		 */
		public static final String CITY = "CN_AREA_CITY";

		/**
		 * 地区
		 */
		public static final String REGION = "CN_AREA_REGION";
	}

	/**
	 * 角色
	 */
	public static class RoleType {

		/**
		 * 角色类型
		 */
		public static final String ROLE_TYPE = "ROLE_TYPE";

		/**
		 * 超级管理员
		 */
		public static final String ADMIN = "ROLE_TYPE_1";

		/**
		 * 普通用户
		 */
		public static final String USER = "ROLE_TYPE_2";

		/**
		 * 特邀主播
		 */
		public static final String ANCHOR = "ROLE_TYPE_3";

		/**
		 * 置业顾问
		 */
		public static final String COUNSELOR = "ROLE_TYPE_4";

		/**
		 * 运营
		 */
		public static final String OPERATION = "ROLE_TYPE_5";
	}

	/**
	 * 角色
	 */
	class RoleLongType {

		/**
		 * 超级管理员
		 */
		public static final Long ADMIN = 1L;

		/**
		 * 普通用户
		 */
		public static final Long USER = 2L;

		/**
		 * 特邀主播
		 */
		public static final Long ANCHOR = 3L;

		/**
		 * 置业顾问
		 */
		public static final Long COUNSELOR = 4L;

		/**
		 * 运营
		 */
		public static final Long OPERATION = 5L;

		/**
		 * 客服
		 */
		public static final Long SERVICE = 6L;

		/**
		 * 商家
		 */
		public static final Long MERCHANT = 7L;

		/**
		 * 经纪人
		 */
		public static final Long BROKER = 8L;
	}

	/**
	 * 登录方式
	 */
	class LoginMethod {

		/**
		 * 登录方式
		 */
		public static final String LOGIN_METHOD = "LOGIN_METHOD";

		/**
		 * tocken登录
		 */
		public static final String TOCKEN = "LOGIN_METHOD_1";

		/**
		 * 密码登录
		 */
		public static final String PASSWORD = "LOGIN_METHOD_2";

		/**
		 * 验证码登录
		 */
		public static final String CAPTCHA = "LOGIN_METHOD_3";
	}

	/**
	 * 登录类型
	 */
	class LoginType {

		/**
		 * web登录
		 */
		public static final String WEB = "LOGIN_TYPE_1";

		/**
		 * app登录
		 */
		public static final String APP = "LOGIN_TYPE_2";

		/**
		 * 后台登录
		 */
		public static final String SYSTEM = "LOGIN_TYPE_3";
	}

	/**
	 * 户型
	 * 
	 * @author HP
	 *
	 */
	class HouseType {

		/**
		 * 新盘
		 */
		public static final String NEWHOUSE = "NEWHOUSE";

		/**
		 * 二手房
		 */
		public static final String SECONDHOUSE = "SECONDHOUSE";

		/**
		 * 购房目的
		 */
		public static final String PURCHASE_PURPOSE = "PURCHASE_PURPOSE";
		/**
		 * 购房预算
		 */
		public static final String BUDGET = "BUDGET";
		/**
		 * 内部配套
		 */
		public static final String INNER_ASSORT = "INNER_ASSORT";
		/**
		 * 房源特色
		 */
		public static final String HOUSING_FEATURE = "HOUSING_FEATURE";
		
		/**
		 * 二手房标签
		 */
		public static final String SECOND_HOUSE_TAG = "SECOND_HOUSE_TAG";
		
		
		/**
		 * 项目配套
		 */
		public static final String MATING = "MATING";
		/**
		 * 物业类型
		 */
		public static final String PROPERTY_TYPE = "PROPERTY_TYPE";
		/**
		 * 房屋总价
		 */
		public static final String HOUSE_TOTAL_PRICE = "HOUSE_TOTAL_PRICE";
		/**
		 * 卧室数量
		 */
		public static final String BEDROOM = "BEDROOM";
		/**
		 * 楼盘状态
		 */
		public static final String BUILDING_STATUS = "BUILDING_STATUS";
		/**
		 * 支付方式
		 */
		public static final String PAYMET = "PAYMET";
		/**
		 * 图片类型
		 */
		public static final String PIC_TYPE = "PIC_TYPE";

	}

	/**
	 * 账号
	 */
	class ACCOUNT_STATUS {

		/**
		 * 正常/入驻中
		 */
		public static final String NORMAL = "ACCOUNT_STATUS_1";

		/**
		 * 冻结
		 */
		public static final String FREEZE = "ACCOUNT_STATUS_2";

	}

	/**
	 * 审核状态
	 */
	class AUDIT_STATUS {

		/**
		 * 审核状态
		 */
		public static final String AUDIT_STATUS = "AUDIT_STATUS";

		/**
		 * 审核状态 - 审核通过
		 */
		public static final String SUCCESS = "AUDIT_STATUS_1";

		/**
		 * 审核状态 - 审核不通过
		 */
		public static final String FAIL = "AUDIT_STATUS_2";

		/**
		 * 审核状态 - 待审核
		 */
		public static final String PENDING = "AUDIT_STATUS_3";
	}

	/**
	 * 需求
	 * 
	 * @author HP
	 *
	 */
	class Demand {
		/**
		 * 未处理
		 */
		public static final String PENDING = "PENDING";
		/**
		 * 已处理
		 */
		public static final String PROCESSED = "PROCESSED";
		/**
		 * 失效
		 */
		public static final String INVALID = "INVALID";
		/**
		 * 商务合作类型
		 */
		public static final String PARTNERSHIP_TYPE = "PARTNERSHIP_TYPE";
		
		
		/**
		 *  合作申请的处理状态： -1：待处理 
		 * */
		public static final String DEAL_NO = "-1";
		
		/**
		 *  合作申请的处理状态： 0：已处理 
		 * */
		public static final String DEAL_OK = "0";
		
		
				
		

	}

	/**
	 * 登录方式
	 */
	class LOGIN_METHOD {

		/**
		 * 密码登录
		 */
		public static final String PASSWORD = "LOGIN_METHOD_1";

		/**
		 * 验证码登录
		 */
		public static final String CAPTCHA = "LOGIN_METHOD_2";
	}

	class HOUSE_REC {
		/**
		 * 
		 */
		public static final String WEB = "LOGIN_TYPE_1";
	}

	/**
	 * Module状态
	 */
	class ModuleType {
		/**
		 * 楼盘
		 */
		public static final String BUILDING = "BUILDING";
		/**
		 * 户型
		 */
		public static final String HOUSETYPE = "HOUSETYPE";
		/**
		 * 需求
		 */
		public static final String DEMAND = "DEMAND";
		/**
		 * 收藏类别
		 */
		public static final String COLLECTION_TYPE = "COLLECTION_TYPE";
		/**
		 * 足迹类别
		 */
		public static final String FOOTMARK_TYPE = "FOOTMARK_TYPE";

	}

	/**
	 * 二手房状态
	 * 
	 * @author HP
	 *
	 */
	class SecondStatus {

		/**
		 * 在售
		 */
		public static final String ONSALE = "ONSALE";

		/**
		 * 已售
		 */
		public static final String SOLD = "SOLD";
	}

	/**
	 * 社区问答
	 * 
	 * @author HP
	 *
	 */
	class community {
		/**
		 * 标签
		 */
		public static final String LABEL = "LABEL";
		/**
		 * 旅居租房标签
		 */
		public static final String SOJOURN = "SOJOURN";
	}

	/**
	 * 文章
	 * 
	 * @author HP
	 *
	 */
	class ArticleType {
		/**
		 * 文章类型
		 */
		public static final String ARTICLE_TYPE = "ARTICLE_TYPE";
		/**
		 *购房指南
		 */
		public static final String ARTICLE_TYPE_1 = "ARTICLE_TYPE_1";
		
		/**
		 * 投资分析
		 */
		public static final String ARTICLE_TYPE_2 = "ARTICLE_TYPE_2";
		
		/**
		 * 泰国商讯
		 */
		public static final String ARTICLE_TYPE_3 = "ARTICLE_TYPE_3";
		/**
		 * 当地生活
		 */
		public static final String ARTICLE_TYPE_4 = "ARTICLE_TYPE_4";
		/**
		 * 181大事件
		 */
		public static final String ARTICLE_TYPE_5 = "ARTICLE_TYPE_5";
		/**
		 * 媒体报道
		 */
		public static final String ARTICLE_TYPE_6 = "ARTICLE_TYPE_6";
		/**
		 * 181大事件
		 */
		public static final String ARTICLE_TYPE_7 = "ARTICLE_TYPE_7";
	}

	/**
	 * 楼盘状态
	 */
	class BUILD_STATUS {

		/**
		 * 预售
		 */
		public static final String TERM_ROOM = "BUILDING_STATUS_1";

		/**
		 * 现楼
		 */
		public static final String PRESENT_BUILD = "BUILDING_STATUS_2";
	}

	/**
	 * 收藏分类
	 */
	class COLLECTION_TYPE {

		/**
		 * 新盘
		 */
		public static final String COLLECTION_TYPE_1 = "COLLECTION_TYPE_1";

		/**
		 * 二手房
		 */
		public static final String COLLECTION_TYPE_2 = "COLLECTION_TYPE_2";
		/**
		 * 资讯
		 */
		public static final String COLLECTION_TYPE_3 = "COLLECTION_TYPE_3";
		/**
		 * 视频/直播
		 */
		public static final String COLLECTION_TYPE_4 = "COLLECTION_TYPE_4";
		/**
		 * 游记
		 */
		public static final String COLLECTION_TYPE_5 = "COLLECTION_TYPE_5";
		/**
		 * 问答
		 */
		public static final String COLLECTION_TYPE_6 = "COLLECTION_TYPE_6";
		/**
		 * 主题
		 */
		public static final String COLLECTION_TYPE_7 = "COLLECTION_TYPE_7";
	}

	/**
	 * 文件业务类型
	 */
	class BIZ_TYPE {

		/**
		 * 效果图
		 */
		public static final String RENDERING = "PIC_TYPE_1";

		/**
		 * 样板间
		 */
		public static final String SHOWROOM = "PIC_TYPE_2";

		/**
		 * 小区配套
		 */
		public static final String MATCHING = "PIC_TYPE_3";

		/**
		 * 实景图
		 */
		public static final String REALITY_IMAGES = "PIC_TYPE_4";

		/**
		 * 项目现场
		 */
		public static final String PROJECT_SITE = "PIC_TYPE_5";

		/**
		 * 营业执照
		 */
		public static final String LICENSE = "PIC_MANAGE_TYPE_1";

		/**
		 * 富文本
		 */
		public static final String RICH_TEXT = "PIC_MANAGE_TYPE_2";
	}

	/**
	 * 
	 * 版本管理
	 *
	 */
	class VERSION_TYPE {
		/**
		 * 版本类型
		 */
		public static final String VERSION_TYPE = "VERSION_TYPE";
		/**
		 * 平台
		 */
		public static final String PLATFORM = "PLATFORM";
	}

	/**
	 * 优惠券状态
	 */
	class COUPON_STATUS {

		/**
		 * 上架中
		 */
		public static final String IN_THE_SHELF = "COUPON_STATUS_1";

		/**
		 * 已下架
		 */
		public static final String SOLD_OUT = "COUPON_STATUS_2";

		/**
		 * 待上架
		 */
		public static final String TO_STAY_ON = "COUPON_STATUS_3";
	}

	/**
	 * 用户优惠券状态
	 */
	class USER_COUPON_STATUS {

		/**
		 * 待使用
		 */
		public static final String UNUSED = "USER_COUPON_STATUS_1";

		/**
		 * 已使用
		 */
		public static final String USED = "USER_COUPON_STATUS_2";

		/**
		 * 已过期
		 */
		public static final String EXPIRED = "USER_COUPON_STATUS_3";

		/**
		 * 已失效
		 */
		public static final String FAILURE = "USER_COUPON_STATUS_4";
	}

	/**
	 * 来源
	 */
	class ORIGIN {

		/**
		 * PC
		 */
		public static final String PC = "PC";

		/**
		 * WAP
		 */
		public static final String WAP = "WAP";

		/**
		 * IOS
		 */
		public static final String IOS = "IOS";

		/**
		 * Android
		 */
		public static final String ANDROID = "ANDROID";

		/**
		 * other
		 */
		public static final String OTHER = "OTHER";
	}

	/**
	 * 国际区号
	 */
	class COUNTRY_CALLING_CODE {

		/**
		 * 中国
		 */
		public static final String CN = "86";

		/**
		 * 泰国
		 */
		public static final String TH = "66";
	}

	/**
	 * 考察团类型
	 */
	class DELEGATION_TYPE {

		/**
		 * 看房团
		 */
		public static final String CONDO_TOUR = "DELEGATION_TYPE_1";

		/**
		 * 行业峰会
		 */
		public static final String INDUSTRY_SUMMIT = "DELEGATION_TYPE_2";
	}

	/**
	 * 考察团状态
	 */
	class DELEGATION_STATUS {

		/**
		 * 开展中
		 */
		public static final String UNDERWAY = "DELEGATION_STATUS_1";

		/**
		 * 已结束
		 */
		public static final String FINISH = "DELEGATION_STATUS_2";
	}

	/**
	 * 意向客户进展
	 */
	class PROGRESS_STATUS {
		/**
		 * 进展状态
		 */
		public static final String PROGRESS_STATUS = "PROGRESS_STATUS";
		/**
		 * 待跟进
		 */
		public static final String PROGRESS_STATUS_0 = "PROGRESS_STATUS_0";
		/**
		 * 暂无进展
		 */
		public static final String PROGRESS_STATUS_1 = "PROGRESS_STATUS_1";
		/**
		 * 意向强烈
		 */
		public static final String PROGRESS_STATUS_2 = "PROGRESS_STATUS_2";
		/**
		 * 意向一般
		 */
		public static final String PROGRESS_STATUS_3 = "PROGRESS_STATUS_3";
		/**
		 * 带看房
		 */
		public static final String PROGRESS_STATUS_4 = "PROGRESS_STATUS_4";
		/**
		 * 成交
		 */
		public static final String PROGRESS_STATUS_5 = "PROGRESS_STATUS_5";
		/**
		 * 未成交
		 */
		public static final String PROGRESS_STATUS_6 = "PROGRESS_STATUS_6";
		/**
		 * 委托跟进
		 */
		public static final String PROGRESS_STATUS_7 = "PROGRESS_STATUS_7";
		/**
		 * 跟进中（父状态）
		 */
		public static final String PROGRESS_STATUS_8 = "PROGRESS_STATUS_8";
		/**
		 * 待跟进（父状态）
		 */
		public static final String PROGRESS_STATUS_9 = "PROGRESS_STATUS_9";
		/**
		 * 已结束（父状态）
		 */
		public static final String PROGRESS_STATUS_10 = "PROGRESS_STATUS_10";
	}

	/**
	 * 上架状态
	 *
	 *
	 */
	class SHELF_STATUS {
		/**
		 * 上架
		 */
		public static final String ON_SHELF = "ON_SHELF";
		/**
		 * 下架
		 */
		public static final String DOWN_SHELF = "DOWN_SHELF";
	}

	/**
	 * 景观类型
	 * 
	 *
	 */
	class LAND_SCAPE_TYPE {
		/**
		 * 海景
		 */
		public static final String LAND_SCAPE_TYPE_1 = "LAND_SCAPE_TYPE_1";
		/**
		 * 江景
		 */
		public static final String LAND_SCAPE_TYPE_2 = "LAND_SCAPE_TYPE_2";
		/**
		 * 城景
		 */
		public static final String LAND_SCAPE_TYPE_3 = "LAND_SCAPE_TYPE_3";
	}

	/**
	 * 问答类型
	 */
	class QUESTION_TYPE {
		/**
		 * 问题
		 */
		public static final String QUESTION = "TYPE_1";
		/**
		 * 旅居租房
		 */
		public static final String SOJOURN = "TYPE_2";
	}

	/**
	 * 旅居租房标签
	 * 
	 * @author HP
	 *
	 */
	class SOJOURN_LABEL {
		/**
		 * 标签
		 */
		public static final String SOJOURN_LABEL = "SOJOURN_LABEL";
		/**
		 * 出租
		 */
		public static final String SOJOURN_LABEL_1 = "SOJOURN_LABEL_1";
		/**
		 * 求租
		 */
		public static final String SOJOURN_LABEL_2 = "SOJOURN_LABEL_2";
		/**
		 * 民宿
		 */
		public static final String SOJOURN_LABEL_3 = "SOJOURN_LABEL_3";
		/**
		 * 其它
		 */
		public static final String SOJOURN_LABEL_4 = "SOJOURN_LABEL_4";
	}

	/**
	 * 房源推荐
	 *
	 */
	class RECOMMEND_TYPE {

		public static final String HOUSE_RECOMMEND = "HOUSE_RECOMMEND";
		/**
		 * 开发商
		 */
		public static final String HOUSE_RECOMMEND_4 = "HOUSE_RECOMMEND_4";
		/**
		 * 新盘
		 */
		public static final String RECOMMEND_TYPE_1 = "RECOMMEND_TYPE_1";
		/**
		 * 二手房
		 */
		public static final String RECOMMEND_TYPE_2 = "RECOMMEND_TYPE_2";
		/**
		 * 地图新盘
		 */
		public static final String RECOMMEND_TYPE_3 = "RECOMMEND_TYPE_3";
		/**
		 * 资讯列表及详情-右下角房源推荐
		 */
		public static final String RECOMMEND_TYPE_4 = "RECOMMEND_TYPE_4";
		/**
		 * 投资游记列表页-右下角房源推荐
		 */
		public static final String RECOMMEND_TYPE_5 = "RECOMMEND_TYPE_5";
		/**
		 * 开发商推荐-首页
		 */
		public static final String RECOMMEND_TYPE_6 = "RECOMMEND_TYPE_6";
		/**
		 * 优质商家-首页
		 */
		public static final String RECOMMEND_TYPE_7 = "RECOMMEND_TYPE_7";
	}

	/**
	 * 楼盘标签
	 *
	 */
	class BUILDING_LABEL {
		/**
		 * 标签
		 */
		public static final String BUILDING_LABEL = "BUILDING_LABEL";
	}

	/**
	 * 足迹分类
	 */
	class FOOTMARK_TYPE {

		/**
		 * 新盘
		 */
		public static final String FOOTMARK_TYPE_1 = "FOOTMARK_TYPE_1";

		/**
		 * 二手房
		 */
		public static final String FOOTMARK_TYPE_2 = "FOOTMARK_TYPE_2";
		/**
		 * 资讯
		 */
		public static final String FOOTMARK_TYPE_3 = "FOOTMARK_TYPE_3";
		/**
		 * 视频/直播
		 */
		public static final String FOOTMARK_TYPE_4 = "FOOTMARK_TYPE_4";
		/**
		 * 游记
		 */
		public static final String FOOTMARK_TYPE_5 = "FOOTMARK_TYPE_5";
	}

	/**
	 * 楼盘标签类别
	 */
	class LABEL_SN {
		/**
		 * 甄选好房
		 */
		public static final String PICK_HOUSE = "LABEL_1";

		/**
		 * 涨幅冠军
		 */
		public static final String HOUSE_GAIN = "LABEL_2";

		/**
		 * 低价房源
		 */
		public static final String LOW_HOUSE = "LABEL_3";

		/**
		 * 包租房源
		 */
		public static final String CHARTERING = "LABEL_4";
	}

	/**
	 * 用户token类型
	 */
	class USER_TOKEN_TYPE {

		/**
		 * 登录token
		 */
		public static final String LOGIN = "TYPE_1";

		/**
		 * 短信token
		 */
		public static final String SMS = "TYPE_2";
	}

	/**
	 * 视频moudle
	 */
	class BUILDING_VIDEO_MODULE {

		/**
		 * 新盘
		 */
		public static final String NEW_HOUSE = "NEW_HOUSE";

		/**
		 * 二手房
		 */
		public static final String SECOND_HOUSE = "SECOND_HOUSE";

		/**
		 * 视频
		 */
		public static final String TYPE_1 = "TYPE_1";

		/**
		 * VR
		 */
		public static final String TYPE_2 = "TYPE_2";
	}
	
	/**
	 * 专题moudle 
	 * */
	class SPECIAL_TOPIC_APP{
		/**
	     * WEB-超链接,
	     */
		public static final String WEB_K = "WEB";
		public static final String WEB_V = "超链接";
		
		/** NEW_HOUSE-新盘详细， */
		public static final String NEW_HOUSE_K = "NEW_HOUSE";
		public static final String NEW_HOUSE_V = "新盘详细";
		
		/**SECOND_HOUSE-二手房详情，*/
		public static final String SECOND_HOUSE_K = "SECOND_HOUSE";
		public static final String SECOND_HOUSE_V = "二手房详情";
		/**NEWS-资讯详情，*/
		public static final String NEWS_K = "NEWS";
		public static final String NEWS_V = "资讯详情";
		/**QUESTION-问答详情，*/
		public static final String QUESTION_K = "QUESTION";
		public static final String QUESTION_V = "问答详情";
		/** HOUSE_VIDEO-视频详情 */
		public static final String HOUSE_VIDEO_K = "HOUSE_VIDEO";
		public static final String HOUSE_VIDEO_V = "视频详情";
	}


	//是否为落地页 （商家广告部分）
	class IS_LANDING_PAGE{

		public static final Integer LANDING_PAGE_YES = 1;
		public static final Integer LANDING_PAGE_NO = 2;

		public static final String LANDING_PAGE_TAIL = "_unique";
	}

	//落地页类型
	class LANDING_PAGE_TYPE{
		public static final String BUILD = "build"; // 新盘
		public static final String LANDING = "landing"; //落地页
		public static final String SECOND_HOUSE = "secondHouse"; //二手房
	}



    //类型区分（访问量 - 1、曝光量 - 2、客询量 - 3） （商家广告部分）
    class TYPE_FLAG{
        public static final Integer VISIT_TYPE = 1;
        public static final Integer EXPOSE_TYPE = 2;
        public static final Integer CONSULT_TYPE = 3;
    }

    class STATUS_FOR_STATISTICS{
        public static final String NORMAL = "normal";
        public static final String STOP = "stop";
    }

    class DELETE_FLAG{
        public static final int DELETE = 1;
        public static final int NORMAL = 0;
    }

}
