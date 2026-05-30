// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SummaryKPI: ImageVector
  get() {
    val current = _summaryKPI
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SummaryKPI",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M7.67 27.5 2 22.45 l1.33 -1.5 L8.97 26 l7.7 -7.45 a1.93 1.93 0 0 1 2.67 0 L22.96 22 l5.58 -5.98 L30 17.4 l-5.58 5.98 a2 2 0 0 1 -2.84 .08 L18 20.03 l-7.66 7.42 a1.96 1.96 0 0 1 -2.67 .05
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.67 27.5
          moveTo(x = 7.67f, y = 27.5f)
          // L 2 22.45
          lineTo(x = 2.0f, y = 22.45f)
          // l 1.33 -1.5
          lineToRelative(dx = 1.33f, dy = -1.5f)
          // L 8.97 26
          lineTo(x = 8.97f, y = 26.0f)
          // l 7.7 -7.45
          lineToRelative(dx = 7.7f, dy = -7.45f)
          // a 1.93 1.93 0 0 1 2.67 0
          arcToRelative(
            a = 1.93f,
            b = 1.93f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.67f,
            dy1 = 0.0f,
          )
          // L 22.96 22
          lineTo(x = 22.96f, y = 22.0f)
          // l 5.58 -5.98
          lineToRelative(dx = 5.58f, dy = -5.98f)
          // L 30 17.4
          lineTo(x = 30.0f, y = 17.4f)
          // l -5.58 5.98
          lineToRelative(dx = -5.58f, dy = 5.98f)
          // a 2 2 0 0 1 -2.84 0.08
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.84f,
            dy1 = 0.08f,
          )
          // L 18 20.03
          lineTo(x = 18.0f, y = 20.03f)
          // l -7.66 7.42
          lineToRelative(dx = -7.66f, dy = 7.42f)
          // a 1.96 1.96 0 0 1 -2.67 0.05
          arcToRelative(
            a = 1.96f,
            b = 1.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.67f,
            dy1 = 0.05f,
          )
        }
        // <polygon points="30.0 11.0 26.0 11.0 28.0 8.0 30.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 11
          moveTo(x = 30.0f, y = 11.0f)
          // L 26 11
          lineTo(x = 26.0f, y = 11.0f)
          // L 28 8
          lineTo(x = 28.0f, y = 8.0f)
          // L 30 11z
          lineTo(x = 30.0f, y = 11.0f)
          close()
        }
        // M22 4 h-4 v2 h4 v2 h-3 v2 h3 v2 h-4 v2 h4 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 m-6 10 h-6 v-4 a2 2 0 0 1 2 -2 h2 V6 h-4 V4 h4 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2 h-2 v2 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 4
          moveTo(x = 22.0f, y = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
          // m -6 10
          moveToRelative(dx = -6.0f, dy = 10.0f)
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
        }
        // <polygon points="6.0 12.0 6.0 4.0 4.0 4.0 4.0 5.0 2.0 5.0 2.0 7.0 4.0 7.0 4.0 12.0 2.0 12.0 2.0 14.0 8.0 14.0 8.0 12.0 6.0 12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 12
          moveTo(x = 6.0f, y = 12.0f)
          // L 6 4
          lineTo(x = 6.0f, y = 4.0f)
          // L 4 4
          lineTo(x = 4.0f, y = 4.0f)
          // L 4 5
          lineTo(x = 4.0f, y = 5.0f)
          // L 2 5
          lineTo(x = 2.0f, y = 5.0f)
          // L 2 7
          lineTo(x = 2.0f, y = 7.0f)
          // L 4 7
          lineTo(x = 4.0f, y = 7.0f)
          // L 4 12
          lineTo(x = 4.0f, y = 12.0f)
          // L 2 12
          lineTo(x = 2.0f, y = 12.0f)
          // L 2 14
          lineTo(x = 2.0f, y = 14.0f)
          // L 8 14
          lineTo(x = 8.0f, y = 14.0f)
          // L 8 12
          lineTo(x = 8.0f, y = 12.0f)
          // L 6 12z
          lineTo(x = 6.0f, y = 12.0f)
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
      .also { _summaryKPI = it }
  }

@Suppress("ObjectPropertyName")
private var _summaryKPI: ImageVector? = null
