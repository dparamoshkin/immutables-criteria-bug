package example;

import com.google.common.collect.ImmutableMap;
import com.mongodb.annotations.Immutable;

public abstract class Revisions<T extends Revision> {

  public abstract ImmutableMap<String, T> revisions();

}
