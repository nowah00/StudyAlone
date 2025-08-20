package eutcha.prob01;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList(); //List<Board> 컬렉션을 dao 객체를 통해 가져옴(?)
        for (Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}
