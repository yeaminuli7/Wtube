<!-- ABOUT THE PROJECT -->
<a href="https://trendshift.io/repositories/3770" target="_blank"><img src="https://trendshift.io/api/badge/repositories/3770" alt="GreyDGL%2FPentestGPT | Trendshift" style="width: 250px; height: 55px;" width="250" height="55"/></a>


# Wtube

**A YouTube app for Android with no account, no ads, and a download button that actually works.**

Wtube plays YouTube in its own video player, saves videos to your phone, and can also grab video
links from TikTok, Facebook and Instagram. Everything stays on your device — there is no login, no
profile, and nothing to sign up for.

**Current version: 1.0.1** · Android 7.0 and newer · Free

---

## Install

1. Open the [Releases page](https://github.com/yeaminuli7/Wtube-/releases/latest) and tap the newest
   `.apk` file.
2. Android will warn you that the file is not from the Play Store. Choose **Settings**, then allow
   your browser to install apps on this device.
3. Open the downloaded file and tap **Install**.

If you already have Wtube, the new version installs straight over the old one. Your downloads,
history and settings are kept.

> The APK is about 4.7 MB. It is signed with the same key as every previous release, so Android
> accepts it as an update.

---

## What you can do

### Watch

- Watch YouTube without an account and without the clutter.
- **Pinch to zoom** into any video. Drag to move around while zoomed, double-tap to reset.
- **Hold to speed up** — press and hold anywhere on the video to play at 2x, then let go.
- **Swipe to adjust** — slide up or down on the **right** half of the video for volume, and on the
  **left** half for screen brightness. Both are smooth, not stepped.
- **Keep listening in the background.** Lock the screen and audio keeps playing, with controls on
  the lock screen and in the notification shade.
- Pick your video quality, turn captions on, and skip sponsored segments automatically.
- Video plays fast even on slow connections.

### Download

- Tap download on any video and choose the quality you want — **HD or SD**, with the file size
  shown before you start.
- **Download as MP3** if you only want the audio. Wtube saves data by fetching the smaller file.
- **Pause and resume** any download, at any time.
- See **percentage, speed and time remaining** while it downloads, in the app and in the
  notification.
- Everything lands in your phone's **Downloads/WTube** folder, and also appears in the app's
  Downloads screen with thumbnails, channel names and file sizes.

### Other video sites

Paste a **TikTok, Facebook, Instagram or any video link** into the search bar. Wtube opens it and
offers you the downloadable files it finds, with the quality and size for each one. This works the
same way popular desktop tools do it, but built into the app — no extra software needed.

### Your library

- **History** keeps what you have watched, grouped by day.
- **Watch Later** and **playlists** let you keep things for later.
- Everything is stored on your phone only.

### No ads

A built-in blocker removes ads and trackers while you browse.

### Private by design

- **No account. No sign-in. No email.** There is nothing to create and nothing to remember.
- Nothing is sent to us. We have no servers and no analytics.
- Your history, playlists and settings are saved on your device.

## Frequently asked

**Do I need a Google account?**
No. Wtube has no sign-in at all. Your subscriptions and account-specific YouTube features are not
available, and that is intentional.

**Does it collect my data?**
No. There is no account system, no analytics and no server of ours. Anything Wtube stores lives in
your phone's storage and disappears when you uninstall the app.

**Where do downloads go?**
To `Downloads/WTube` on your phone, which any file manager can open. The Wtube app also lists them
for you.

**Can I download anything?**
Almost. Wtube can save any video it can reach directly. Some services protect their videos so they
cannot be saved by any app — those will show a message instead of a download option. Livestreams
and videos that only play in the browser cannot be saved.

**Will updates keep my downloads?**
Yes. Every version uses the same app identity and signing key, so installing an update keeps
everything. Uninstalling the app removes its settings, but the video files in `Downloads/WTube`
stay on your phone.

**Is it safe?**
The app is built from the source code in this repository by GitHub's own build service for every
release, so what you download matches the code you can read here.

---

## About this project

Wtube is built and signed automatically. Each release is produced by a GitHub Actions workflow from
this repository's source, and every release includes the source code alongside the app.

- **Complete development history** — every version, what broke and how it was fixed:
  [`mytube-web/DEVLOG.md`](mytube-web/DEVLOG.md)
- **Building it yourself** — the project builds without Android Studio:
  [`mytube-web/README.md`](mytube-web/README.md)

Wtube is not affiliated with YouTube or Google. Use it with content you have the right to
download.
