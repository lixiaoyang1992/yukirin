package com.lxy.yukirin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	int img[] = new int[7];
	boolean immclickable[] = new boolean[7];
	ImageView temp = null;
	int flag = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView main_text = (TextView) findViewById(R.id.main_content);
		final Button main_button = (Button) findViewById(R.id.main_button);
		final ImageView main_img1 = (ImageView) findViewById(R.id.main_img1);
		final ImageView main_img2 = (ImageView) findViewById(R.id.main_img2);
		final ImageView main_img3 = (ImageView) findViewById(R.id.main_img3);
		final ImageView main_img4 = (ImageView) findViewById(R.id.main_img4);
		final ImageView main_img5 = (ImageView) findViewById(R.id.main_img5);
		final ImageView main_img6 = (ImageView) findViewById(R.id.main_img6);
		main_text.setText("ゆきりん");
		main_button.setText("重新开始");

		init();

		main_button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				init();
				show(main_img1, 0);
				show(main_img2, 0);
				show(main_img3, 0);
				show(main_img4, 0);
				show(main_img5, 0);
				show(main_img6, 0);
			}
		});

		main_img1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (immclickable[1]) {
					show(main_img1, img[1]);
					if (flag == 0) {
						flag = 1;
						temp = main_img1;
						immclickable[1] = false;
					} else {
						if (img[flag] != img[1]) {
							show(temp, 0);
							show(main_img1, 0);
							immclickable[flag] = true;
						} else {
							immclickable[1] = false;
						}
						temp = null;
						flag = 0;
					}
				}
			}
		});

		main_img2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (immclickable[2]) {
					show(main_img2, img[2]);
					if (flag == 0) {
						flag = 2;
						temp = main_img2;
						immclickable[2] = false;
					} else {
						if (img[flag] != img[2]) {
							show(temp, 0);
							show(main_img2, 0);
							immclickable[flag] = true;
						} else {
							immclickable[2] = false;
						}
						temp = null;
						flag = 0;
					}
				}
			}
		});
		main_img3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (immclickable[3]) {
					show(main_img3, img[3]);
					if (flag == 0) {
						flag = 3;
						temp = main_img3;
						immclickable[3] = false;
					} else {
						if (img[flag] != img[3]) {
							show(temp, 0);
							show(main_img3, 0);
							immclickable[flag] = true;
						} else {
							immclickable[3] = false;
						}
						temp = null;
						flag = 0;
					}
				}
			}
		});
		main_img4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (immclickable[4]) {
					show(main_img4, img[4]);
					if (flag == 0) {
						flag = 4;
						temp = main_img4;
						immclickable[4] = false;
					} else {
						if (img[flag] != img[4]) {
							show(temp, 0);
							show(main_img4, 0);
							immclickable[flag] = true;
						} else {
							immclickable[4] = false;
						}
						temp = null;
						flag = 0;
					}
				}
			}
		});
		main_img5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (immclickable[5]) {
					show(main_img5, img[5]);
					if (flag == 0) {
						flag = 5;
						temp = main_img5;
						immclickable[5] = false;
					} else {
						if (img[flag] != img[5]) {
							show(temp, 0);
							show(main_img5, 0);
							immclickable[flag] = true;
						} else {
							immclickable[5] = false;
						}
						temp = null;
						flag = 0;
					}
				}
			}
		});
		main_img6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (immclickable[6]) {
					show(main_img6, img[6]);
					if (flag == 0) {
						flag = 6;
						temp = main_img6;
						immclickable[6] = false;
					} else {
						if (img[flag] != img[6]) {
							show(temp, 0);
							show(main_img6, 0);
							immclickable[flag] = true;
						} else {
							immclickable[6] = false;
						}
						temp = null;
						flag = 0;
					}
				}
			}
		});
	}

	public void init() {
		int i = 6;
		int[] j = { 1, 1, 2, 2, 3, 3 };
		for (int n = 1; n <= 6; n++) {
			int x = (int) (Math.random() * i);
			img[n] = j[x];
			j[x] = j[i - 1];
			i--;
		}

		for (int m = 0; m < immclickable.length; m++) {
			immclickable[m] = true;

		}
	}

	public void show(ImageView img, int i) {
		if (i == 0)
			img.setImageResource(R.drawable.puzzle);
		if (i == 1)
			img.setImageResource(R.drawable.yuki1);
		if (i == 2)
			img.setImageResource(R.drawable.yuki2);
		if (i == 3)
			img.setImageResource(R.drawable.yuki3);
		if (i == 4)
			img.setImageResource(R.drawable.yuki4);
	}
}
