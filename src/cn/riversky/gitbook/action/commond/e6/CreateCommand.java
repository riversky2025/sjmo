package cn.riversky.gitbook.action.commond.e6;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/6.
 */
public class CreateCommand implements Command {
    private BoardScreen boardScreen;

    public CreateCommand() {
        this.boardScreen = new BoardScreen();
    }

    @Override
    public void execute() {
        boardScreen.create();
    }
}
