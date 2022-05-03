package example;

import org.immutables.criteria.Criteria;
import org.immutables.gson.Gson.TypeAdapters;
import org.immutables.value.Value.Immutable;

@Immutable
@TypeAdapters
@Criteria
@Criteria.Repository(name = "entities")
public abstract class ExampleEntity {

  public abstract Definition definition();

}
