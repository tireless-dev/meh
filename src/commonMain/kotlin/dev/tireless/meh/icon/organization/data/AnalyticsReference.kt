// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AnalyticsReference: ImageVector
  get() {
    val current = _analyticsReference
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AnalyticsReference",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="4.0 20.0 4.0 22.0 8.586 22.0 2.0 28.586 3.414 30.0 10.0 23.414 10.0 28.0 12.0 28.0 12.0 20.0 4.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // L 4 22
          lineTo(x = 4.0f, y = 22.0f)
          // L 8.586 22
          lineTo(x = 8.586f, y = 22.0f)
          // L 2 28.586
          lineTo(x = 2.0f, y = 28.586f)
          // L 3.414 30
          lineTo(x = 3.414f, y = 30.0f)
          // L 10 23.414
          lineTo(x = 10.0f, y = 23.414f)
          // L 10 28
          lineTo(x = 10.0f, y = 28.0f)
          // L 12 28
          lineTo(x = 12.0f, y = 28.0f)
          // L 12 20
          lineTo(x = 12.0f, y = 20.0f)
          // L 4 20z
          lineTo(x = 4.0f, y = 20.0f)
          close()
        }
        // M30 4 h-7 v2 h3.59 L19 13.59 l-4.3 -4.3 a1 1 0 0 0 -1.4 0 L8 14.6 9.41 16 14 11.41 l4.3 4.3 a1 1 0 0 0 1.4 0 L28 7.4 V11 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 4
          moveTo(x = 30.0f, y = 4.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3.59
          horizontalLineToRelative(dx = 3.59f)
          // L 19 13.59
          lineTo(x = 19.0f, y = 13.59f)
          // l -4.3 -4.3
          lineToRelative(dx = -4.3f, dy = -4.3f)
          // a 1 1 0 0 0 -1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.4f,
            dy1 = 0.0f,
          )
          // L 8 14.6
          lineTo(x = 8.0f, y = 14.6f)
          // L 9.41 16
          lineTo(x = 9.41f, y = 16.0f)
          // L 14 11.41
          lineTo(x = 14.0f, y = 11.41f)
          // l 4.3 4.3
          lineToRelative(dx = 4.3f, dy = 4.3f)
          // a 1 1 0 0 0 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // L 28 7.4
          lineTo(x = 28.0f, y = 7.4f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // <rect width="14" height="2" x="16.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <rect width="2" height="14" x="2.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 2
          moveTo(x = 2.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
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
      .also { _analyticsReference = it }
  }

@Suppress("ObjectPropertyName")
private var _analyticsReference: ImageVector? = null
