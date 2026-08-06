# Fabric port progress

Saya memulai migrasi penuh ke Fabric di cabang `fabric-port`.

Perubahan awal:
- Scaffold Fabric (fabric.mod.json, access widener draft, mixins update)
- Ubah main & client entrypoints ke Fabric ModInitializer / ClientModInitializer
- Ganti build.gradle menjadi template fabric-loom (Java 21)

Langkah selanjutnya yang sedang saya kerjakan:
1) Migrasi semua registrasi (items, blocks, entities, recipes) dari NeoForge deferred register -> Fabric Registry API
2) Migrasi event bus dan lifecycle hooks
3) Migrasi network handlers ke Fabric networking API
4) Ganti dependencies ke versi Fabric
5) Lengkapi access widener dan periksa mixin compatibility

Cara membantu:
- Jalankan `./gradlew build` pada cabang `fabric-port` dan kirimkan error yang muncul. Saya akan memperbaiki secara iteratif.
- Atau saya terus melakukan migrasi bertahap sampai kompilasi bersih.

Status: in-progress. Saya akan mulai migrasi registrasi entities/blocks/items sekarang.
