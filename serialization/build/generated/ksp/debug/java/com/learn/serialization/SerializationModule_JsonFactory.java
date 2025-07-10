package com.learn.serialization;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.serialization.json.Json;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class SerializationModule_JsonFactory implements Factory<Json> {
  @Override
  public Json get() {
    return json();
  }

  public static SerializationModule_JsonFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Json json() {
    return Preconditions.checkNotNullFromProvides(SerializationModule.INSTANCE.json());
  }

  private static final class InstanceHolder {
    static final SerializationModule_JsonFactory INSTANCE = new SerializationModule_JsonFactory();
  }
}
