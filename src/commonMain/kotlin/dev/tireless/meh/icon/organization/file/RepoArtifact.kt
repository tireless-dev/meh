// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RepoArtifact: ImageVector
  get() {
    val current = _repoArtifact
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RepoArtifact",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 24 v-2 h-2.1 c-.1 -.6 -.4 -1.2 -.7 -1.8 l1.5 -1.5 -1.4 -1.4 -1.5 1.5 a5 5 0 0 0 -1.8 -.7 V16 h-2 v2.1 c-.6 .1 -1.2 .4 -1.8 .7 l-1.5 -1.5 -1.4 1.4 1.5 1.5 a5 5 0 0 0 -.7 1.8 H16 v2 h2.1 c.1 .6 .4 1.2 .7 1.8 l-1.5 1.5 1.4 1.4 1.5 -1.5 c.5 .3 1.1 .6 1.8 .7 V30 h2 v-2.1 c.6 -.1 1.2 -.4 1.8 -.7 l1.5 1.5 1.4 -1.4 -1.5 -1.5 c.3 -.5 .6 -1.1 .7 -1.8z m-7 2 c-1.7 0 -3 -1.3 -3 -3 s1.3 -3 3 -3 3 1.3 3 3 -1.3 3 -3 3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 24
          moveTo(x = 30.0f, y = 24.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.1
          horizontalLineToRelative(dx = -2.1f)
          // c -0.1 -0.6 -0.4 -1.2 -0.7 -1.8
          curveToRelative(
            dx1 = -0.1f,
            dy1 = -0.6f,
            dx2 = -0.4f,
            dy2 = -1.2f,
            dx3 = -0.7f,
            dy3 = -1.8f,
          )
          // l 1.5 -1.5
          lineToRelative(dx = 1.5f, dy = -1.5f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // l -1.5 1.5
          lineToRelative(dx = -1.5f, dy = 1.5f)
          // a 5 5 0 0 0 -1.8 -0.7
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.8f,
            dy1 = -0.7f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.1
          verticalLineToRelative(dy = 2.1f)
          // c -0.6 0.1 -1.2 0.4 -1.8 0.7
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 0.1f,
            dx2 = -1.2f,
            dy2 = 0.4f,
            dx3 = -1.8f,
            dy3 = 0.7f,
          )
          // l -1.5 -1.5
          lineToRelative(dx = -1.5f, dy = -1.5f)
          // l -1.4 1.4
          lineToRelative(dx = -1.4f, dy = 1.4f)
          // l 1.5 1.5
          lineToRelative(dx = 1.5f, dy = 1.5f)
          // a 5 5 0 0 0 -0.7 1.8
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.7f,
            dy1 = 1.8f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.1
          horizontalLineToRelative(dx = 2.1f)
          // c 0.1 0.6 0.4 1.2 0.7 1.8
          curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.6f,
            dx2 = 0.4f,
            dy2 = 1.2f,
            dx3 = 0.7f,
            dy3 = 1.8f,
          )
          // l -1.5 1.5
          lineToRelative(dx = -1.5f, dy = 1.5f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // l 1.5 -1.5
          lineToRelative(dx = 1.5f, dy = -1.5f)
          // c 0.5 0.3 1.1 0.6 1.8 0.7
          curveToRelative(
            dx1 = 0.5f,
            dy1 = 0.3f,
            dx2 = 1.1f,
            dy2 = 0.6f,
            dx3 = 1.8f,
            dy3 = 0.7f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.1
          verticalLineToRelative(dy = -2.1f)
          // c 0.6 -0.1 1.2 -0.4 1.8 -0.7
          curveToRelative(
            dx1 = 0.6f,
            dy1 = -0.1f,
            dx2 = 1.2f,
            dy2 = -0.4f,
            dx3 = 1.8f,
            dy3 = -0.7f,
          )
          // l 1.5 1.5
          lineToRelative(dx = 1.5f, dy = 1.5f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // l -1.5 -1.5
          lineToRelative(dx = -1.5f, dy = -1.5f)
          // c 0.3 -0.5 0.6 -1.1 0.7 -1.8z
          curveToRelative(
            dx1 = 0.3f,
            dy1 = -0.5f,
            dx2 = 0.6f,
            dy2 = -1.1f,
            dx3 = 0.7f,
            dy3 = -1.8f,
          )
          close()
          // m -7 2
          moveToRelative(dx = -7.0f, dy = 2.0f)
          // c -1.7 0 -3 -1.3 -3 -3
          curveToRelative(
            dx1 = -1.7f,
            dy1 = 0.0f,
            dx2 = -3.0f,
            dy2 = -1.3f,
            dx3 = -3.0f,
            dy3 = -3.0f,
          )
          // s 1.3 -3 3 -3
          reflectiveCurveToRelative(
            dx1 = 1.3f,
            dy1 = -3.0f,
            dx2 = 3.0f,
            dy2 = -3.0f,
          )
          // s 3 1.3 3 3
          reflectiveCurveToRelative(
            dx1 = 3.0f,
            dy1 = 1.3f,
            dx2 = 3.0f,
            dy2 = 3.0f,
          )
          // s -1.3 3 -3 3
          reflectiveCurveToRelative(
            dx1 = -1.3f,
            dy1 = 3.0f,
            dx2 = -3.0f,
            dy2 = 3.0f,
          )
        }
        // M28 8 H16 l-3.4 -3.4 A2 2 0 0 0 11.2 4 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h10 v-2 H4 V6 h7.2 l3.4 3.4 .6 .6 H28 v5 h2 v-5 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 8
          moveTo(x = 28.0f, y = 8.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // l -3.4 -3.4
          lineToRelative(dx = -3.4f, dy = -3.4f)
          // A 2 2 0 0 0 11.2 4
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.2f,
            y1 = 4.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 7.2
          horizontalLineToRelative(dx = 7.2f)
          // l 3.4 3.4
          lineToRelative(dx = 3.4f, dy = 3.4f)
          // l 0.6 0.6
          lineToRelative(dx = 0.6f, dy = 0.6f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
        )
      }
      // <rect width="32" height="32" fill="#000" style="fill:none" />
      path(
        fill = SolidColor(Color.Transparent),
      ) {
        // M 0 0
        moveTo(x = 0.0f, y = 0.0f)
        // h 32
        horizontalLineToRelative(dx = 32.0f)
        // v 32
        verticalLineToRelative(dy = 32.0f)
        // h -32z
        horizontalLineToRelative(dx = -32.0f)
        close()
      }
    }.build()
      .also { _repoArtifact = it }
  }

@Suppress("ObjectPropertyName")
private var _repoArtifact: ImageVector? = null
