
package com.bongoacademy.masterjuba_new;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayListForVideo(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForWebsite(String category_name, Integer drawable, String url){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("url", url);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForPDF(String category_name, Integer drawable, String pdfAssetName){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("pdfAssetName", pdfAssetName);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		/*
		//========================Video Item Category
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("hegsoEcow8Q", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("kLHCDZeTVJk", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		createPlayListForVideo("Funny Dog", R.drawable.category_1);

		//=========================Category for website loader
		createCategoryForWebsite("Prothom Alo", R.drawable.category_2, "https://www.prothomalo.com/");

		//=========================Category for website loader
		createCategoryForWebsite("PDF FromUrl", R.drawable.category_3, "https://drive.google.com/file/d/1vB-oWIwJU6KuIKnIoqWukjZEyNjrd7IJ/view?usp=sharing");

		//===========================Category for PDF Viewer
		createCategoryForPDF("PDF FromAsset", R.drawable.category_4, "my_sample_pdf.pdf");
		//==========================================================================*
		 */


		//========================Video Item Category
		addVideoItem("x36_QR28WDU", "Muza - Cheena Cheena (Feat. Sadia Ali)", "Muza - Cheena Cheena (Feat. Sadia Ali) | Official Music Video | Meem Haque");
		addVideoItem("8y_0i2_3ijs", "Bangla_song minar rahman new song 2020 মিনারের সেরা 12 টি গান", "Bangla_song minar rahman new song 2020 মিনারের সেরা 12 টি গান");
		addVideoItem("pRpeEdMmmQ0", "Shakira - Waka Waka (This Time for Africa)", "The Official 2010 FIFA World Cup™ Song");
		addVideoItem("zC3UbTf4qrM", "Afghan Jalebi (Ya Baba) FULL VIDEO Song", "Afghan Jalebi (Ya Baba) FULL VIDEO Song | Phantom | Saif Ali Khan, Katrina Kaif | T-Series");
		addVideoItem("p8ns5bLizPg", "Chaka Chak (Lyrical) | Atrangi Re", "Chaka Chak (Lyrical) | Atrangi Re");
		createPlayListForVideo("Funny Dog", R.drawable.category_1);
		createPlayListForVideo("Funny Dog", R.drawable.category_1);

		//=========================
		createCategoryForWebsite("Student", R.drawable.category_2, "https://deendarpartner.com/");
		createCategoryForWebsite("Student", R.drawable.category_2, "https://deendarpartner.com/");

		createCategoryForWebsite("BBC Bangla", R.drawable.category_3, "https://www.bbc.com/bengali");
		createCategoryForWebsite("BBC Bangla", R.drawable.category_3, "https://www.bbc.com/bengali");
		//=========================

		//===========================
		createCategoryForPDF("PDF FromAsset", R.drawable.category_4, "my_sample_pdf.pdf");
		//==========================================================================*


		createCategoryForWebsite("New Item", R.drawable.category_2, "jubayer");

		createCategoryForWebsite("Another Item", R.drawable.category_2, "https://batb.io/");
















	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

