// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RuleLocked: ImageVector
  get() {
    val current = _ruleLocked
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RuleLocked",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 22 v-3 c0 -2.2 -1.8 -4 -4 -4 s-4 1.8 -4 4 v3 a2 2 0 0 0 -2 2 v5 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 v-5 a2 2 0 0 0 -2 -2 m-6 -3 c0 -1.1 .9 -2 2 -2 s2 .9 2 2 v3 h-4z m-2 10 v-5 h8 v5z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 22
          moveTo(x = 28.0f, y = 22.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // c 0 -2.2 -1.8 -4 -4 -4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.2f,
            dx2 = -1.8f,
            dy2 = -4.0f,
            dx3 = -4.0f,
            dy3 = -4.0f,
          )
          // s -4 1.8 -4 4
          reflectiveCurveToRelative(
            dx1 = -4.0f,
            dy1 = 1.8f,
            dx2 = -4.0f,
            dy2 = 4.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
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
          // v 5
          verticalLineToRelative(dy = 5.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // m -6 -3
          moveToRelative(dx = -6.0f, dy = -3.0f)
          // c 0 -1.1 0.9 -2 2 -2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.1f,
            dx2 = 0.9f,
            dy2 = -2.0f,
            dx3 = 2.0f,
            dy3 = -2.0f,
          )
          // s 2 0.9 2 2
          reflectiveCurveToRelative(
            dx1 = 2.0f,
            dy1 = 0.9f,
            dx2 = 2.0f,
            dy2 = 2.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m -2 10
          moveToRelative(dx = -2.0f, dy = 10.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 5z
          verticalLineToRelative(dy = 5.0f)
          close()
        }
        // <rect width="6" height="2" x="8.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 16
          moveTo(x = 8.0f, y = 16.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <rect width="12" height="2" x="8.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 10
          moveTo(x = 8.0f, y = 10.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // M26 4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v13 c0 4.1 2.2 7.8 5.8 9.7 l5.2 2.8 v-2.3 l-4.2 -2.3 A8.8 8.8 0 0 1 4 17 V4 h20 v8 h2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
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
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // c 0 4.1 2.2 7.8 5.8 9.7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 4.1f,
            dx2 = 2.2f,
            dy2 = 7.8f,
            dx3 = 5.8f,
            dy3 = 9.7f,
          )
          // l 5.2 2.8
          lineToRelative(dx = 5.2f, dy = 2.8f)
          // v -2.3
          verticalLineToRelative(dy = -2.3f)
          // l -4.2 -2.3
          lineToRelative(dx = -4.2f, dy = -2.3f)
          // A 8.8 8.8 0 0 1 4 17
          arcTo(
            horizontalEllipseRadius = 8.8f,
            verticalEllipseRadius = 8.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 17.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _ruleLocked = it }
  }

@Suppress("ObjectPropertyName")
private var _ruleLocked: ImageVector? = null
