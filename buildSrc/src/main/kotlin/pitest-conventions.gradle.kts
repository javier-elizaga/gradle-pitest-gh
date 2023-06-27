import java.io.IOException

plugins {
  id("info.solidsoft.pitest")
}

configure<info.solidsoft.gradle.pitest.PitestPluginExtension> {
  pitestVersion.set("1.9.11")
  junit5PluginVersion.set("1.1.2")
  outputFormats.addAll(listOf("HTML", "XML"))
  mutationThreshold.set(85)
  timestampedReports.set(false)
  threads.set(4)
  enableDefaultIncrementalAnalysis.set(true)
  jvmArgs.add("-Xmx1024m")
  failWhenNoMutations.set(true)
  targetClasses.set(listOf("com.*"))
}
