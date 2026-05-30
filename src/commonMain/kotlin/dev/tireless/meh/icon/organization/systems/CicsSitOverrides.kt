// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CicsSitOverrides: ImageVector
  get() {
    val current = _cicsSitOverrides
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CicsSitOverrides",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m31.7 20.3 -3 -3 a1 1 0 0 0 -1.4 0 L18 26.58 V31 h4.41 l9.3 -9.3 a1 1 0 0 0 0 -1.4 m-7.4 6 L21.58 29 H20 v-1.59 l2.7 -2.7 2.3 -2.3 L26.59 24z m3.7 -3.71 L26.41 21 28 19.41 29.59 21z M20 20 v-2 h-4 v-7 h10 v2 h2 V6 a3 3 0 0 0 -3 -3 H5 a3 3 0 0 0 -3 3 v20 a3 3 0 0 0 3 3 h11 v-9z m-6 -2 H4 v-7 h10z M5 5 h20 a1 1 0 0 1 1 1 v3 H4 V6 a1 1 0 0 1 1 -1 m9 22 H5 a1 1 0 0 1 -1 -1 v-6 h10z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31.7 20.3
          moveTo(x = 31.7f, y = 20.3f)
          // l -3 -3
          lineToRelative(dx = -3.0f, dy = -3.0f)
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
          // L 18 26.58
          lineTo(x = 18.0f, y = 26.58f)
          // V 31
          verticalLineTo(y = 31.0f)
          // h 4.41
          horizontalLineToRelative(dx = 4.41f)
          // l 9.3 -9.3
          lineToRelative(dx = 9.3f, dy = -9.3f)
          // a 1 1 0 0 0 0 -1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.4f,
          )
          // m -7.4 6
          moveToRelative(dx = -7.4f, dy = 6.0f)
          // L 21.58 29
          lineTo(x = 21.58f, y = 29.0f)
          // H 20
          horizontalLineTo(x = 20.0f)
          // v -1.59
          verticalLineToRelative(dy = -1.59f)
          // l 2.7 -2.7
          lineToRelative(dx = 2.7f, dy = -2.7f)
          // l 2.3 -2.3
          lineToRelative(dx = 2.3f, dy = -2.3f)
          // L 26.59 24z
          lineTo(x = 26.59f, y = 24.0f)
          close()
          // m 3.7 -3.71
          moveToRelative(dx = 3.7f, dy = -3.71f)
          // L 26.41 21
          lineTo(x = 26.41f, y = 21.0f)
          // L 28 19.41
          lineTo(x = 28.0f, y = 19.41f)
          // L 29.59 21z
          lineTo(x = 29.59f, y = 21.0f)
          close()
          // M 20 20
          moveTo(x = 20.0f, y = 20.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 3 3 0 0 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // a 3 3 0 0 0 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v -9z
          verticalLineToRelative(dy = -9.0f)
          close()
          // m -6 -2
          moveToRelative(dx = -6.0f, dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
          // M 5 5
          moveTo(x = 5.0f, y = 5.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // m 9 22
          moveToRelative(dx = 9.0f, dy = 22.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
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
      .also { _cicsSitOverrides = it }
  }

@Suppress("ObjectPropertyName")
private var _cicsSitOverrides: ImageVector? = null
