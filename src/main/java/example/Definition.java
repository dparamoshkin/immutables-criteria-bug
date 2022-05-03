package example;

public abstract class Definition<R extends Revisions<T>, T extends Revision>{

  public abstract String name();

  public abstract R revisions();
}
