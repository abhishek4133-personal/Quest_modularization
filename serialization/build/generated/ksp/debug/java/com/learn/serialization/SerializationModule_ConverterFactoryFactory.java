package com.learn.serialization;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;

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
public final class SerializationModule_ConverterFactoryFactory implements Factory<Converter.Factory> {
  private final Provider<Json> jsonProvider;

  public SerializationModule_ConverterFactoryFactory(Provider<Json> jsonProvider) {
    this.jsonProvider = jsonProvider;
  }

  @Override
  public Converter.Factory get() {
    return converterFactory(jsonProvider.get());
  }

  public static SerializationModule_ConverterFactoryFactory create(Provider<Json> jsonProvider) {
    return new SerializationModule_ConverterFactoryFactory(jsonProvider);
  }

  public static Converter.Factory converterFactory(Json json) {
    return Preconditions.checkNotNullFromProvides(SerializationModule.INSTANCE.converterFactory(json));
  }
}
