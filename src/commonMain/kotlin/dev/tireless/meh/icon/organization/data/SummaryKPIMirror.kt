// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SummaryKPIMirror: ImageVector
  get() {
    val current = _summaryKPIMirror
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SummaryKPIMirror",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m24.3 27.5 5.7 -5.1 -1.3 -1.4 -5.7 5 -7.7 -7.4 c-.7 -.7 -1.9 -.7 -2.7 0 L9 22 l-5.6 -6 L2 17.4 l5.6 6 c.8 .8 2 .8 2.8 .1 L14 20 l7.7 7.4 c.7 .8 1.9 .8 2.6 .1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.3 27.5
          moveTo(x = 24.3f, y = 27.5f)
          // l 5.7 -5.1
          lineToRelative(dx = 5.7f, dy = -5.1f)
          // l -1.3 -1.4
          lineToRelative(dx = -1.3f, dy = -1.4f)
          // l -5.7 5
          lineToRelative(dx = -5.7f, dy = 5.0f)
          // l -7.7 -7.4
          lineToRelative(dx = -7.7f, dy = -7.4f)
          // c -0.7 -0.7 -1.9 -0.7 -2.7 0
          curveToRelative(
            dx1 = -0.7f,
            dy1 = -0.7f,
            dx2 = -1.9f,
            dy2 = -0.7f,
            dx3 = -2.7f,
            dy3 = 0.0f,
          )
          // L 9 22
          lineTo(x = 9.0f, y = 22.0f)
          // l -5.6 -6
          lineToRelative(dx = -5.6f, dy = -6.0f)
          // L 2 17.4
          lineTo(x = 2.0f, y = 17.4f)
          // l 5.6 6
          lineToRelative(dx = 5.6f, dy = 6.0f)
          // c 0.8 0.8 2 0.8 2.8 0.1
          curveToRelative(
            dx1 = 0.8f,
            dy1 = 0.8f,
            dx2 = 2.0f,
            dy2 = 0.8f,
            dx3 = 2.8f,
            dy3 = 0.1f,
          )
          // L 14 20
          lineTo(x = 14.0f, y = 20.0f)
          // l 7.7 7.4
          lineToRelative(dx = 7.7f, dy = 7.4f)
          // c 0.7 0.8 1.9 0.8 2.6 0.1
          curveToRelative(
            dx1 = 0.7f,
            dy1 = 0.8f,
            dx2 = 1.9f,
            dy2 = 0.8f,
            dx3 = 2.6f,
            dy3 = 0.1f,
          )
        }
        // <polygon points="28.0 12.0 28.0 4.0 26.0 4.0 26.0 5.0 24.0 5.0 24.0 7.0 26.0 7.0 26.0 12.0 24.0 12.0 24.0 14.0 30.0 14.0 30.0 12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 12
          moveTo(x = 28.0f, y = 12.0f)
          // L 28 4
          lineTo(x = 28.0f, y = 4.0f)
          // L 26 4
          lineTo(x = 26.0f, y = 4.0f)
          // L 26 5
          lineTo(x = 26.0f, y = 5.0f)
          // L 24 5
          lineTo(x = 24.0f, y = 5.0f)
          // L 24 7
          lineTo(x = 24.0f, y = 7.0f)
          // L 26 7
          lineTo(x = 26.0f, y = 7.0f)
          // L 26 12
          lineTo(x = 26.0f, y = 12.0f)
          // L 24 12
          lineTo(x = 24.0f, y = 12.0f)
          // L 24 14
          lineTo(x = 24.0f, y = 14.0f)
          // L 30 14
          lineTo(x = 30.0f, y = 14.0f)
          // L 30 12z
          lineTo(x = 30.0f, y = 12.0f)
          close()
        }
        // M22 14 h-6 v-4 a2 2 0 0 1 2 -2 h2 V6 h-4 V4 h4 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2 h-2 v2 h4z M12 4 H8 v2 h4 v2 H9 v2 h3 v2 H8 v2 h4 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 14
          moveTo(x = 22.0f, y = 14.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // M 12 4
          moveTo(x = 12.0f, y = 4.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
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
        // <polygon points="6.0 11.0 2.0 11.0 4.0 8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 11
          moveTo(x = 6.0f, y = 11.0f)
          // L 2 11
          lineTo(x = 2.0f, y = 11.0f)
          // L 4 8z
          lineTo(x = 4.0f, y = 8.0f)
          close()
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
      .also { _summaryKPIMirror = it }
  }

@Suppress("ObjectPropertyName")
private var _summaryKPIMirror: ImageVector? = null
