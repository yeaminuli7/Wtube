# APK deliverables

Only the **current** build lives here: `Wtube_v1.0.1.apk`.

Old builds are not kept in the repository. Each new version replaces the file
in this directory, so anyone opening the folder sees exactly one APK — the one
they should install.

## Rules

1. **Build into this directory.** `tools/build-offline.sh` writes its output
   here (`mytube-web/apk/`).
2. **Never build into `build/`.** Directories named `build/` are excluded from
   workspace snapshots — files written there are silently discarded and never
   reach anyone. This has already cost one lost APK.
3. **Keep only one APK.** After building a new version, delete the previous
   one. A stack of old APKs confuses users and makes every clone and source
   download far larger than the app itself.
4. **Commit and push the current APK.** The remote is the only durable store;
   local git state can be reset between sessions.
5. **Never commit signing keys.** `.gitignore` excludes `*.p12`, `*.jks` and
   `*.keystore` — **except `debug.keystore`**, which is deliberately tracked so
   successive builds share one key and install over each other. The real
   release keystore lives outside the repo.
6. **The release is what users download.** `mytube-web/apk/` is a convenience;
   the Releases page is the real distribution channel.

## After building

```sh
cd mytube-web
bash tools/build-offline.sh 103 1.0.2      # writes apk/Wtube_v1.0.2.apk
git rm -q apk/Wtube_v1.0.1.apk             # drop the previous version
git add -f apk/Wtube_v1.0.2.apk
git commit -m "Wtube 1.0.2"
git push origin arena/72be64be-vr
```

GitHub Actions then builds, signs and publishes the release automatically —
no manual `gh release create` needed. Bump `mytube-web/VERSION` for a new
version and the workflow takes care of the rest.

## Download

Current version: **1.0.1**

```
https://github.com/yeaminuli7/Wtube/releases/latest
```

## Version history

| Version | What changed |
| --- | --- |
| 1.0.1 | Version number restarted; app unchanged from 2.24 |
