
package me.yeojoy.spannabletest;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.Menu;
import android.widget.TextView;

public class StringActivity extends Activity {
    
    private TextView mTvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);
        
        mTvResult = (TextView) findViewById(R.id.tv_result);
        
        setResult();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.string, menu);
        return true;
    }

    private void setResult() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("<font color='#00ff20'>").append("Hi. ");
        sb.append("<bold>").append("I'm ").append("</bold>").append("</font>");
        sb.append("Yeojong.");
        
        mTvResult.setText(Html.fromHtml(sb.toString()));
        mTvResult.append("\n\n\n");
        
        String str1 = "당신은 ";
        String str2 = "당신이 ";
        String str3 = "생각하는 ";
        String str4 = "것보다 ";
        String str5 = "아름답다는 것을 ";
        String str6 = "알아야 합니다.";
        
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
         
        // 글자색 변경
        SpannableString spannableString = new SpannableString(str1);
        // ForegroundColorSpan(Color.rgb(148, 83, 61))
        spannableString.setSpan(new ForegroundColorSpan(0xFF3366CC), 0, str1.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.append(spannableString);
        
        // 글자크기변경
        spannableString = new SpannableString(str2);
        spannableString.setSpan(new AbsoluteSizeSpan(40, true), 0, str2.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.append(spannableString);
        
        // URL Link
        spannableString = new SpannableString(str3);
        spannableString.setSpan(new URLSpan("http://www.google.co.kr"), 0, str3.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new AbsoluteSizeSpan(20, true), 0, str3.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.append(spannableString);
        
        // BOLD
        spannableString = new SpannableString(str4);
        spannableString.setSpan(new StyleSpan(Typeface.BOLD), 0, str4.length(),Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, str4.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE), 0, str4.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        spannableStringBuilder.append(spannableString);
        
        // BOLD_ITALIC
        spannableString = new SpannableString(str5);
        spannableString.setSpan(new StyleSpan(Typeface.BOLD_ITALIC), 0, str5.length(),Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new AbsoluteSizeSpan(20, true), 0, str5.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.append(spannableString);
        
        // ITALIC
        spannableString = new SpannableString(str6);
        spannableString.setSpan(new StyleSpan(Typeface.ITALIC), 0, str6.length(),Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new AbsoluteSizeSpan(25, true), 0, str6.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.append(spannableString);
        
        mTvResult.append(spannableStringBuilder);
    }

}
