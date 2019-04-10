package com.narara.android_movie_test;

import android.widget.ImageView;

public class MovieInfo {
    public MovieInfo() {
    }

    public String[] titles = {
            "꾼",
            "파이널 스코어",
            "퍼스트맨",
            "인터스텔라",
            "인셉션"
    };

    public String[] contents = {
            "‘희대의 사기꾼’을 잡기 위해 사기‘꾼’들이 뭉쳤다!",
            "전직 미 육군 출신의 마이클은 자신의 부하였던 앤디가 자신 때문에 죽었다는 죄책감으로 그의 아내와 딸을 지극정성으로 돌본다. ",
            "여러분은 지금까지 보지 못한 걸 보게 될 겁니다",
            "우린 답을 찾을 거야, 늘 그랬듯이",
            "다크 나이트의 스케일과 매트릭스의 미래가 만났다 | 생각을 훔치는 거대한 전쟁"
    };

    public String[] getTitles() {
        return titles;
    }

    public void setTitles(String[] titles) {
        this.titles = titles;
    }

    public String[] getContents() {
        return contents;
    }

    public void setContents(String[] contents) {
        this.contents = contents;
    }
}
