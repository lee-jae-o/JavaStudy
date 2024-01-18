class Paper {
    void color() {
        System.out.println("종이에 색을 칠하다.");
    }
}

class Black extends Paper {
    @Override
    void color() {
        System.out.println("종이에 검은색을 칠하다.");
    }
}

class White extends Paper {
    @Override
    void color() {
        System.out.println("종이에 흰색을 칠하다.");
    }
}
public class Study23 {
    public static void main(String[] args) {
        Paper paper = new Black();
        paper.color();
    }

}
