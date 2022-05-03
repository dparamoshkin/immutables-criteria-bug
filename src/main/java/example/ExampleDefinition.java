package example;

import org.immutables.gson.Gson.TypeAdapters;
import org.immutables.value.Value.Immutable;

@Immutable
@TypeAdapters
public abstract class ExampleDefinition extends Definition<ExampleRevisions, ExampleRevision> {

}
